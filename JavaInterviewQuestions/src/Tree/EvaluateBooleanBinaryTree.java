package Tree;

import Tree.SmallestStringStartingFromLeaf.TreeNode;

public class EvaluateBooleanBinaryTree {

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

	public static boolean helper(TreeNode root) {
		if (root.val == 0 || root.val == 1) {
			return root.val == 1;
		} else if (root.val == 2) {
			return helper(root.left) || helper(root.right);
		} else if (root.val == 3) {
			return helper(root.left) && helper(root.right);
		}

		return false;
	}

	public static boolean evaluateTree(TreeNode root) {
		return helper(root);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(0);
		TreeNode node5 = new TreeNode(1);

		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;

		System.out.println(evaluateTree(node1));

	}

}
