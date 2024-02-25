package DynamicProgramming;

import java.util.Arrays;

public class BestTimetoBuyandSellStock2 {

	public static int maxProfit(int[] prices) {
		int n = prices.length;
		if(n <= 1) {
			return 0;
		}
		int[] dp = new int[n];
		for(int i = 1;i < n;i++) {
			dp[i] = Math.max(dp[i - 1] + prices[i] - prices[i - 1], dp[i - 1]);
		}
		
		return dp[n - 1];
	}

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
