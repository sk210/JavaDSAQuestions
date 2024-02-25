package Array;

public class BestTimetoBuyandSellStockwithTransactionFee {

	public static int maxProfit(int[] prices, int fee) {
		int buy = Integer.MIN_VALUE;
		int sell = 0;
		
		for(int price : prices) {
			buy = Math.max(buy, sell - price);
			sell = Math.max(sell, buy + price - fee);
		}
		
		return sell;
	}

	public static void main(String[] args) {
		int[] prices = {1,3,2,8,4,9};
		System.out.println(maxProfit(prices, 2));
	}

}
