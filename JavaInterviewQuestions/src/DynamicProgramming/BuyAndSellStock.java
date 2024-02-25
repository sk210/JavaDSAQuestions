package DynamicProgramming;

public class BuyAndSellStock {

	public static int maxProfit(int[] prices) {
		int low = Integer.MAX_VALUE;
		int temp = 0;
		int high = 0;
		for(int i = 0;i<prices.length;i++) {
			if(prices[i] < low) {
				low = prices[i];
			}
			temp = prices[i]-low;
			if(temp > high) {
				high = temp;
			}
		}
		return high;
	}

	public static void main(String[] args) {
		int[] prices = { 3, 2, 6, 5, 0, 3 };
		System.out.println(maxProfit(prices));

	}

}
