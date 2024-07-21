package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BuildaMatrixWithConditions {

	public static boolean topStart(List<Integer>[] graph, int node, int[] visited, Deque<Integer> queue) {
		if (visited[node] == 2) {
			return false;
		}

		if (visited[node] == 0) {
			visited[node] = 2;
			for (int child : graph[node]) {
				visited[node] = 2;
				if (!topStart(graph, child, visited, queue)) {
					return false;
				}
			}
			visited[node] = 1;
			queue.add(node);
		}

		return true;
	}

	public static int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
		List<Integer>[] rowGrph = new ArrayList[k + 1];

		for (int i = 1; i < k + 1; i++) {
			rowGrph[i] = new ArrayList<Integer>();
		}

		for (int[] roeCondition : rowConditions) {
			rowGrph[roeCondition[0]].add(roeCondition[1]);
		}

		List<Integer>[] colGraph = new ArrayList[k + 1];

		for (int i = 1; i < k + 1; i++) {
			colGraph[i] = new ArrayList<Integer>();
		}

		for (int[] colCondition : colConditions) {
			colGraph[colCondition[0]].add(colCondition[1]);
		}

		int[] visited = new int[k + 1];
		Deque<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i < rowGrph.length; i++) {
			if (!topStart(rowGrph, i, visited, queue)) {
				return new int[0][0];
			}
		}

		int[] rowIndexMap = new int[k + 1];

		for (int i = 0; i < k; i++) {
			int node = queue.pollLast();
			rowIndexMap[node] = i;
		}

		visited = new int[k + 1];
		queue = new LinkedList<Integer>();

		for (int i = 1; i < colGraph.length; i++) {
			if (!topStart(colGraph, i, visited, queue)) {
				return new int[0][0];
			}
		}

		int[] colOrder = new int[k];
		int[] colIndexMap = new int[k + 1];

		for (int i = 0; i < k; i++) {
			int node = queue.pollLast();
			colOrder[i] = node;
			colIndexMap[node] = i;
		}

		int[][] result = new int[k][k];

		for (int i = 1; i <= k; i++) {
			result[rowIndexMap[i]][colIndexMap[i]] = i;
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] rowConditions = { { 1, 2 }, { 3, 2 } };
		int[][] colConditions = { { 2, 1 }, { 3, 2 } };
		System.out.println(Arrays.deepToString(buildMatrix(3, rowConditions, colConditions)));

	}

}
