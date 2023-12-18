package Recursion;

public class FibonacciSeries {

	public static int fibonacciSeries(int n, int[] dp) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		if (dp[n] != 0) {
			return dp[n];
		}
		
		int ans1 = fibonacciSeries(n-1, dp);
		int ans2 = fibonacciSeries(n-2, dp);
		
		dp[n] = ans1 + ans2;
		return dp[n];

	}

	public static void main(String[] args) {
		int n = 5;
		int[] dp = new int[n+1];
		System.out.println(fibonacciSeries(n, dp));
	}

}
