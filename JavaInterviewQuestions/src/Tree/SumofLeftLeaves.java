package Tree;

public class SumofLeftLeaves {

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

	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		int ans = 0;

		if (root.left != null) {
			if (root.left.left == null && root.left.right == null)
				ans += root.left.val;
			else
				ans += sumOfLeftLeaves(root.left);
		}

		ans += sumOfLeftLeaves(root.right);

		return ans;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;

		System.out.println(sumOfLeftLeaves(node1));

	}

}
