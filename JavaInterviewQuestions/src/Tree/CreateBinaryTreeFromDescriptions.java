package Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Tree.BinarySearchTreetoGreaterSumTree.TreeNode;

public class CreateBinaryTreeFromDescriptions {

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

	public static TreeNode helper(int currNodeValue, Map<Integer, int[]> childrenHasMap) {
		TreeNode node = new TreeNode(currNodeValue);

		if (childrenHasMap.containsKey(currNodeValue)) {
			int[] children = childrenHasMap.get(currNodeValue);
			if (children[0] != -1) {
				node.left = helper(children[0], childrenHasMap);
			}

			if (children[1] != -1) {
				node.right = helper(children[1], childrenHasMap);
			}
		}

		return node;
	}

	public static TreeNode createBinaryTree(int[][] descriptions) {
		Set<Integer> childrenSet = new HashSet<Integer>();
		Map<Integer, int[]> childrenHasMap = new HashMap<Integer, int[]>();

		for (int[] description : descriptions) {
			int parent = description[0];
			int child = description[1];
			childrenHasMap.putIfAbsent(parent, new int[] { -1, -1 });
			childrenSet.add(child);
			boolean isLeft = description[2] == 1;

			if (isLeft) {
				childrenHasMap.get(parent)[0] = child;
			} else {
				childrenHasMap.get(parent)[1] = child;
			}
		}

		int headNodeValue = 0;

		for (int parent : childrenHasMap.keySet()) {
			if (!childrenSet.contains(parent)) {
				headNodeValue = parent;
				break;
			}
		}

		return helper(headNodeValue, childrenHasMap);
	}

	public static void printTree(TreeNode root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		int[][] descriptions = { { 20, 15, 1 }, { 20, 17, 0 }, { 50, 20, 1 }, { 50, 80, 0 }, { 80, 19, 1 } };
		TreeNode node = createBinaryTree(descriptions);
		printTree(node);
	}

}
