package DynamicProgramming;

public class MinimumFallingPathSum {

	public static int minFallingPathSum(int[][] matrix) {
		int n = matrix.length;
		int[][] dp = new int[n][n];
		int ans = Integer.MAX_VALUE;
		
		for(int j = 0; j  < n; j++) {
			dp[0][j] = matrix[0][j];
		}
		
		for(int i = 1;i < n; i++) {
			for(int j = 0; j < n; j++) {
				int temp = Integer.MAX_VALUE;
				
				for(int k = -1; k <= 1; k++) {
					if(j + k >= 0 && j + k < n) {
						temp = Math.min(temp, matrix[i][j] + dp[i - 1][j + k]);
					}
					
					dp[i][j] = temp;
				}
			}
		}
		
		for(int i = 0; i< n;i++) {
			ans = Math.min(ans, dp[n - 1][i]);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
		System.out.println(minFallingPathSum(matrix));
	}

}
