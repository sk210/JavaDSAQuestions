package Tree;

import Tree.DeleteLeavesWithaGivenValue.TreeNode;

public class NumberofGoodLeafNodesPairs {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static int res = 0;

	public static int[] helper(TreeNode node, int distance) {
		int[] map = new int[11];
		if (node == null)
			return map;

		if (node.left == null && node.right == null) {
			map[1] = 1;
		}

		int[] left = helper(node.left, distance);
		int[] right = helper(node.right, distance);

		for (int i = 1; i < distance; i++) {
			for (int j = 1; j <= distance - i; j++) {
				res += (left[i] * right[j]);
			}
		}

		for (int i = 2; i < 11; i++) {
			map[i] += left[i - 1] + right[i - 1];
		}

		return map;
	}

	public static int countPairs(TreeNode root, int distance) {
		helper(root, distance);
		return res;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		
		node1.left = node2;
		node1.right = node3;
		node2.right = node4;
		System.out.println(countPairs(node1, 3));

	}

}
