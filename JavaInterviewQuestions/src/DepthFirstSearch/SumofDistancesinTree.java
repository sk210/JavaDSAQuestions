package DepthFirstSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumofDistancesinTree {

	public static Map<Integer, List<Integer>> graph;
	public static int[] count;
	public static int[] res;

	public static void dfs(int node, int parent) {
		for (int child : graph.get(node)) {
			if (child != parent) {
				dfs(child, node);
				count[node] += count[child];
				res[node] += res[child] + count[child];
			}
		}
	}

	public static void dfs2(int node, int parent) {
		for (int child : graph.get(node)) {
			if (child != parent) {
				res[child] = res[node] - count[child] + count.length - count[child];
				dfs2(child, node);
			}
		}
	}

	public static int[] sumOfDistancesInTree(int n, int[][] edges) {
		if (n == 1)
			return new int[1];
		graph = new HashMap<Integer, List<Integer>>();
		count = new int[n];
		res = new int[n];

		Arrays.fill(count, 1);

		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			graph.putIfAbsent(u, new ArrayList<Integer>());
			graph.putIfAbsent(v, new ArrayList<Integer>());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		dfs(0, -1);
		dfs2(0, -1);

		return res;

	}

	public static void main(String[] args) {
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } };
		System.out.println(Arrays.toString(sumOfDistancesInTree(6, edges)));
	}

}
