package DynamicProgramming;

public class MinimumPathSumAns2 {
	
	public static int helper(int[][] grid, int i, int j, int m, int n, int[][] memo) {
		if(i == m || j == n) {
			return Integer.MAX_VALUE;
		}
		else if(i == m - 1 && j == n - 1) {
			return grid[i][j];
		}
		else if(memo[i][j] != 0) {
			return memo[i][j];
		}
		
		return memo[i][j] = grid[i][j] + Math.min(helper(grid, i + 1, j, m, n, memo), helper(grid, i, j + 1, m, n, memo));
	}

	public static int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] memo = new int[m][n];
		return helper(grid, 0, 0, m, n, memo);
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(minPathSum(grid));
	}

}
