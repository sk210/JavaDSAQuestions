package SlidingWindow;

public class MaximumSumOfSubArrayOfSizeK {

	public static int maxSumOfSubArray(int[] nums, int k) {
		int maxSum = Integer.MIN_VALUE;
		int tempSum = 0;
		
		for(int i = 0;i < nums.length;i++) {
			tempSum += nums[i];
			if(i >= k - 1) {
				maxSum = Math.max(maxSum, tempSum);
				tempSum -= nums[i - (k - 1)];
			}
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = {5,4,3,6,8,9};
		System.out.println(maxSumOfSubArray(nums, 3));
	}

}
