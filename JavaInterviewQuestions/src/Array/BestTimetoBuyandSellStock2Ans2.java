package Array;

public class BestTimetoBuyandSellStock2Ans2 {
	
	public static int maxProfit(int[] prices) {
		int buy = Integer.MIN_VALUE;
		int sell = 0;
		
		for(int price : prices) {
			buy = Math.max(buy, sell - price);
			sell = Math.max(sell, buy + price);
		}
		
		return sell;
	}

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
