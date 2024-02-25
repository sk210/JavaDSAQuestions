package DynamicProgramming;

public class BestTimetoBuyandSellStock3 {

	public static int maxProfit(int[] prices) {
		int min = prices[0]; 
		int n = prices.length;
		int[] dp = new int[n];
		for(int i = 1;i < n; i++) {
			dp[i] = Math.max(dp[i - 1], prices[i] - min);
			if(min > prices[i]) {
				min = prices[i];
			}
		}
		
		int result = dp[n - 1];
		int max = prices[n - 1];
		int prev = 0;
		
		for(int i = n - 1;i > -1;i--) {
			prev = Math.max(prev, max - prices[i]);
			result = Math.max(result, prev + dp[i]);
			if(max < prices[i]) {
				max = prices[i];
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] prices = { 3, 3, 5, 0, 0, 3, 1, 4 };
		System.out.println(maxProfit(prices));

	}

}
