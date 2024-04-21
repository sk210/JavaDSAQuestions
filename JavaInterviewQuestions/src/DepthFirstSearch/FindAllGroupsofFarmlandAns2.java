package DepthFirstSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllGroupsofFarmlandAns2 {

	public static int[] dfs(int[][] land, int row, int col) {
		int[] coordinates = { row, col, row, col };
		int r = row;
		int c = col;

		while (r < land.length && land[r][col] == 1)
			r++;
		while (c < land[0].length && land[row][c] == 1)
			c++;

		coordinates[2] = r - 1;
		coordinates[3] = c - 1;

		for (int i = row; i < r; i++) {
			for (int j = col; j < c; j++) {
				land[i][j] = 0;
			}
		}

		return coordinates;
	}

	public static int[][] findFarmland(int[][] land) {
		List<int[]> ans = new ArrayList<int[]>();

		int m = land.length;
		int n = land[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (land[i][j] == 1) {
					ans.add(dfs(land, i, j));
				}
			}
		}

		return ans.toArray(new int[ans.size()][]);
	}

	public static void main(String[] args) {
		int[][] land = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 } };
		System.out.println(Arrays.deepToString(findFarmland(land)));

	}

}
