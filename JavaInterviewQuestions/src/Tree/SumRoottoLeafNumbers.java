package Tree;

import Tree.SumofLeftLeaves.TreeNode;

public class SumRoottoLeafNumbers {

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

	public static int helper(TreeNode root, int sum) {
		if (root == null)
			return 0;

		sum = sum * 10 + root.val;

		if (root.left == null && root.right == null)
			return sum;

		return helper(root.left, sum) + helper(root.right, sum);
	}

	public static int sumNumbers(TreeNode root) {
		return helper(root, 0);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;
		System.out.println(sumNumbers(node1));
	}

}
