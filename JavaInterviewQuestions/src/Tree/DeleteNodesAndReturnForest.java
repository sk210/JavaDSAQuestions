package Tree;

import java.util.ArrayList;
import java.util.List;

public class DeleteNodesAndReturnForest {

	public static boolean[] set = new boolean[1001];
	public static List<TreeNode> res;

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

	public static TreeNode helper(TreeNode root, boolean flag) {
		if (root == null)
			return root;
		root.left = helper(root.left, set[root.val]);
		root.right = helper(root.right, set[root.val]);
		if (!set[root.val] && flag) {
			res.add(root);
		}

		return set[root.val] ? null : root;
	}

	public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		res = new ArrayList<>();

		for (int n : to_delete) {
			set[n] = true;
		}

		helper(root, true);
		return res;
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
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		List<TreeNode> ans = delNodes(node1, new int[] { 3, 5 });
		for (TreeNode node : ans) {
			printTree(node);
			System.out.println();
		}
	}

}
