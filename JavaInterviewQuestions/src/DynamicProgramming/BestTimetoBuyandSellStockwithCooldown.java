package DynamicProgramming;

public class BestTimetoBuyandSellStockwithCooldown {

	public static int maxProfit(int[] prices) {
		int prev_buy;
		int buy = Integer.MIN_VALUE;
		int prev_sell = 0;
		int sell = 0;

		for (int price : prices) {
			prev_buy = buy;
			buy = Math.max(prev_buy, prev_sell - price);
			prev_sell = sell;
			sell = Math.max(prev_sell, prev_buy + price);
		}

		return sell;

	}

	public static void main(String[] args) {
		int[] prices = { 1, 2, 4, 0, 3 };
		System.out.println(maxProfit(prices));

	}

}
