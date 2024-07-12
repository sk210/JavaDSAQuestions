package DepthFirstSearch;

public class PathwithMaximumGold {

	public static int helper(int row, int col, int m, int n, int[][] grid) {
		if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == 0)
			return 0;

		int currentGold = grid[row][col];
		grid[row][col] = 0;

		int d = helper(row + 1, col, m, n, grid);
		int u = helper(row - 1, col, m, n, grid);
		int r = helper(row, col + 1, m, n, grid);
		int l = helper(row, col - 1, m, n, grid);

		grid[row][col] = currentGold;

		return currentGold + Math.max(Math.max(r, l), Math.max(u, d));
	}

	public static int getMaximumGold(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int maxGold = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] > 0)
					maxGold = Math.max(maxGold, helper(i, j, m, n, grid));
			}
		}

		return maxGold;
	}

	public static void main(String[] args) {
		int[][] grid = { { 0, 6, 0 }, { 5, 8, 7 }, { 0, 9, 0 } };
		System.out.println(getMaximumGold(grid));

	}

}
