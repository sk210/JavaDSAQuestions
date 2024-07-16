package Tree;

import Tree.SmallestStringStartingFromLeaf.TreeNode;

public class StepByStepDirectionsFromaBinaryTreeNodetoAnother {

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

	public static boolean helper(TreeNode n, int val, StringBuilder sb) {
		if (n.val == val) {
			return true;
		}

		if (n.left != null && helper(n.left, val, sb)) {
			sb.append("L");
		} else if (n.right != null && helper(n.right, val, sb)) {
			sb.append("R");
		}
		return sb.length() > 0;
	}

	public static String getDirections(TreeNode root, int startValue, int destValue) {
		StringBuilder s = new StringBuilder(), d = new StringBuilder();
		helper(root, startValue, s);
		helper(root, destValue, d);
		int i = 0;
		int max = Math.min(d.length(), s.length());
		while (i < max && s.charAt(s.length() - i - 1) == d.charAt(d.length() - i - 1)) {
			++i;
		}
		return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(4);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		System.out.println(getDirections(node1, 3, 6));

	}

}
