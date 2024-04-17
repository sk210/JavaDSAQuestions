package Tree;

import Tree.AddOneRowtoTree.TreeNode;

public class SmallestStringStartingFromLeaf {

	static String smallString = null;

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

	public static void helper(TreeNode root, StringBuilder currString) {
		if (root == null)
			return;

		currString.insert(0, (char) ('a' + root.val));

		if (root.left == null && root.right == null) {
			if (smallString == null || currString.toString().compareTo(smallString) < 0) {
				smallString = currString.toString();
			}
		} else {
			helper(root.left, currString);
			helper(root.right, currString);
		}

		currString.deleteCharAt(0);
	}

	public static String smallestFromLeaf(TreeNode root) {
		helper(root, new StringBuilder());
		return smallString;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(0);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(3);
		TreeNode node7 = new TreeNode(4);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		System.out.println(smallestFromLeaf(node1));

	}

}
