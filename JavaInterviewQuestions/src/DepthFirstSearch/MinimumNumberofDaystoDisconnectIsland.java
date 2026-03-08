package DepthFirstSearch;

public class MinimumNumberofDaystoDisconnectIsland {

	public static void dfs(int[][] grid, int r, int c, boolean[][] seen) {
		seen[r][c] = true;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		for (int[] dir : directions) {
			int nr = r + dir[0], nc = c + dir[1];
			if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 1 && !seen[nr][nc]) {
				dfs(grid, nr, nc, seen);
			}
		}
	}

	public static int countIsland(int[][] grid) {
		boolean[][] seen = new boolean[grid.length][grid[0].length];
		int isLand = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1 && !seen[i][j]) {
					isLand++;
					dfs(grid, i, j, seen);
				}
			}
		}

		return isLand;
	}

	public static int minDays(int[][] grid) {
		if (countIsland(grid) != 1)
			return 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					grid[i][j] = 0;
					if (countIsland(grid) != 1)
						return 1;
					grid[i][j] = 1;
				}
			}
		}

		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
