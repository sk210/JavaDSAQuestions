package Graph;

public class FindifPathExistsinGraph {

	public static boolean validPath(int n, int[][] edges, int source, int destination) {
		if (edges.length == 0)
			return true;
		boolean[] visited = new boolean[n];
		visited[source] = true;
		boolean flag = true;

		while (flag) {
			flag = false;
			for (int[] edge : edges) {
				if (visited[edge[0]] != visited[edge[1]]) {
					visited[edge[0]] = true;
					visited[edge[1]] = true;
					flag = true;
				}

				if (visited[destination])
					return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } };
		System.out.println(validPath(6, edges, 0, 5));

	}

}
