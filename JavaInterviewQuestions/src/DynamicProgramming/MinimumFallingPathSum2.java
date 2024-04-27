package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSum2 {

	public static int minFallingPathSum(int[][] grid) {
		int n = grid.length; 
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[n][n];
		
		for(int j = 0; j  < n; j++) {
			dp[0][j] = grid[0][j];
		}
		
		for(int i = 1; i < n;i++) {
			for(int j = 0; j < n; j++) {
				int temp = Integer.MAX_VALUE;
				
				for(int k = 0; k <  n; k++) {
					if(j != k) {
						temp = Math.min(temp, grid[i][j] + dp[i - 1][k]);
					}
					dp[i][j] = temp;
				}
			}
		}
		
		for(int i = 0;i < n;i++) {
			ans = Math.min(ans, dp[n- 1][i]);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(minFallingPathSum(grid));

	}

}
