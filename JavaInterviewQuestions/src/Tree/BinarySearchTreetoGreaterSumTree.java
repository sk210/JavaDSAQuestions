package Tree;

import Tree.SmallestStringStartingFromLeaf.TreeNode;

public class BinarySearchTreetoGreaterSumTree {
	
	public static int sum = 0;
	
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

	public static TreeNode bstToGst(TreeNode root) {
		if(root != null) {
			bstToGst(root.right);
			sum += root.val;
			root.val = sum;
			bstToGst(root.left);
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
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(0);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(3);
		TreeNode node6 = new TreeNode(5);
		TreeNode node7 = new TreeNode(6);
		TreeNode node8 = new TreeNode(7);
		TreeNode node9 = new TreeNode(8);

		node1.left = node2;
		node1.right = node7;
		node2.left = node3;
		node2.right = node4;
		node4.right = node5;
		node7.left = node6;
		node7.right = node8;
		node8.right = node9;
		
		bstToGst(node1);
		printTree(node1);
		

	}

}
