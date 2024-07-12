package Graph;

import java.util.ArrayList;
import java.util.List;

public class AllAncestorsofaNodeinaDirectedAcyclicGraph {

	public static void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res, boolean[] visit) {
		visit[curr] = true;
		for (int dest : graph[curr]) {
			if (!visit[dest]) {
				res.get(dest).add(parent);
				dfs(graph, parent, dest, res, visit);
			}
		}
	}

	public static List<List<Integer>> getAncestors(int n, int[][] edges) {
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			res.add(new ArrayList<Integer>());
		}

		ArrayList<Integer>[] graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int[] edge : edges) {
			graph[edge[0]].add(edge[1]);
		}

		for (int i = 0; i < n; i++) {
			dfs(graph, i, i, res, new boolean[n]);
		}

		for (int i = 0; i < n; i++) {
			res.get(i).sort(Integer::compareTo);
		}

		return res;
	}

	public static void main(String[] args) {
		int[][] edges = { { 0, 3 }, { 0, 4 }, { 1, 3 }, { 2, 4 }, { 2, 7 }, { 3, 5 }, { 3, 6 }, { 3, 7 }, { 4, 6 } };
		System.out.println(getAncestors(8, edges));

	}

}
