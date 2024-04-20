package DepthFirstSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllGroupsofFarmland {

	public static void dfs(int[][] grid, int i, int j, int[] bound) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1)
			return;

		grid[i][j] = 0;
		bound[2] = Math.max(bound[2], i);
		bound[3] = Math.max(bound[3], j);

		dfs(grid, i + 1, j, bound);
		dfs(grid, i - 1, j, bound);
		dfs(grid, i, j + 1, bound);
		dfs(grid, i, j - 1, bound);
	}

	public static int[][] findFarmland(int[][] land) {
		List<int[]> result = new ArrayList<int[]>();

		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[0].length; j++) {
				if (land[i][j] == 1) {
					int[] bound = { i, j, i, j };
					dfs(land, i, j, bound);
					result.add(bound);
				}
			}
		}

		int[][] ans = new int[result.size()][4];

		for (int i = 0; i < result.size(); i++) {
			ans[i] = result.get(i);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[][] land = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 } };
		System.out.println(Arrays.deepToString(findFarmland(land)));
	}

}
