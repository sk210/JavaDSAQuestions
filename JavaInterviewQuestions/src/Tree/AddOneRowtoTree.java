package Tree;

import Tree.SumofLeftLeaves.TreeNode;

public class AddOneRowtoTree {

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

	public static void helper(TreeNode root, int val, int depth) {
		if (root == null)
			return;

		depth -= 1;

		if (depth == 1) {
			root.left = new TreeNode(val, root.left, null);
			root.right = new TreeNode(val, null, root.right);
		} else {
			helper(root.left, val, depth);
			helper(root.right, val, depth);
		}

		return;
	}

	public static TreeNode addOneRow(TreeNode root, int val, int depth) {
		if (depth == 1)
			return new TreeNode(val, root, null);
		helper(root, val, depth);
		return root;
	}

	public static void printTree(TreeNode root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(1);
		TreeNode node6 = new TreeNode(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;

		addOneRow(node1, 1, 2);
		printTree(node1);
	}

}
