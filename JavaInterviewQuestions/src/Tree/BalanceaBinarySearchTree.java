package Tree;

import java.util.ArrayList;
import java.util.List;

import Tree.SmallestStringStartingFromLeaf.TreeNode;

public class BalanceaBinarySearchTree {

	public static List<TreeNode> sortedTreeArr = new ArrayList<TreeNode>();

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

	public static void inorderTravesal(TreeNode root) {
		if (root != null) {
			inorderTravesal(root.left);
			sortedTreeArr.add(root);
			inorderTravesal(root.right);
		}
	}

	public static TreeNode sortedArrTOBST(int start, int end) {
		if (start > end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode root = sortedTreeArr.get(mid);
		root.left = sortedArrTOBST(start, mid - 1);
		root.right = sortedArrTOBST(mid + 1, end);
		return root;
	}

	public static TreeNode balanceBST(TreeNode root) {
		inorderTravesal(root);
		return sortedArrTOBST(0, sortedTreeArr.size() - 1);
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
		TreeNode node4 = new TreeNode(4);

		node1.right = node2;
		node2.right = node3;
		node3.right = node4;

		TreeNode ans = balanceBST(node1);
		printTree(ans);
	}

}
