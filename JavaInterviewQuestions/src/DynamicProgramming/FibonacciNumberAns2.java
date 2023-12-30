package DynamicProgramming;

public class FibonacciNumberAns2 {

	public static int fib(int n) {
		int[] dp = new int[n + 1];
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(fib(5));

	}

}
