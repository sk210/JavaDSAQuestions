package Tree;

import Tree.SmallestStringStartingFromLeaf.TreeNode;

public class DeleteLeavesWithaGivenValue {

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

	public static TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root == null) {
			return null;
		}

		root.left = removeLeafNodes(root.left, target);
		root.right = removeLeafNodes(root.right, target);

		if (root.left == null && root.right == null && root.val == target) {
			return null;
		}

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
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(2);
		TreeNode node6 = new TreeNode(4);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;

		removeLeafNodes(node1, 2);
		printTree(node1);

	}

}
