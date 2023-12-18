package Array;

public class MaximumProductDifferenceBetweenTwoPairs {

	public static int maxProductDifference(int[] nums) {
		int firstBig = 0;
		int secondBig = 0;
		int firstSmall = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		
		for(int n : nums) {
			if(firstBig < n) {
				secondBig = firstBig;
				firstBig = n;
			}
			else if(secondBig < n) {
				secondBig = n;
			}
			
			if(firstSmall > n) {
				secondSmall = firstSmall;
				firstSmall = n;
			}
			else if(secondSmall > n) {
				secondSmall = n;
			}
		}
		
		return firstBig * secondBig - firstSmall * secondSmall;
	}

	public static void main(String[] args) {
		int[] nums = {5,6,2,7,4};
		System.out.println(maxProductDifference(nums));
	}

}
