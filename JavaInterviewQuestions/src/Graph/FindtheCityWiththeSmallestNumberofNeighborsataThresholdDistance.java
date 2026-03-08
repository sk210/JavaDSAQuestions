package Graph;

import java.util.Arrays;

public class FindtheCityWiththeSmallestNumberofNeighborsataThresholdDistance {

	public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
		int[][] distance = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(distance[i], 1000000000);
			distance[i][i] = 0;
		}

		for (int[] edge : edges) {
			distance[edge[0]][edge[1]] = edge[2];
			distance[edge[1]][edge[0]] = edge[2];
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
				}
			}
		}

		int ans = -1;
		int mini = Integer.MAX_VALUE;
		int[] reachable = new int[n];
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i != j && distance[i][j] <= distanceThreshold) {
					count++;
				}
			}

			reachable[i] = count;
			if (count <= mini) {
				mini = count;
				ans = i;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[][] edges = { { 0, 1, 3 }, { 1, 2, 1 }, { 1, 3, 4 }, { 2, 3, 1 } };
		System.out.println(findTheCity(4, edges, 4));

	}

}
