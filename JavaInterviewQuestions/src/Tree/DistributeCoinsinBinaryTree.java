package Tree;

public class DistributeCoinsinBinaryTree {

	public static int moves;

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

	public static int dfs(TreeNode root) {
		if (root == null)
			return 0;

		int leftValue = dfs(root.left);
		int rightValue = dfs(root.right);
		moves += Math.abs(leftValue) + Math.abs(rightValue);

		return root.val + leftValue + rightValue - 1;
	}

	public static int distributeCoins(TreeNode root) {
		dfs(root);
		return moves;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(0);
		TreeNode node3 = new TreeNode(0);

		node1.left = node2;
		node1.right = node3;

		System.out.println(distributeCoins(node1));

	}

}
