package SlidingWindow;

public class MaximumAverageSubarray1 {

	public static double findMaxAverage(int[] nums, int k) {
		double maxSum = Integer.MIN_VALUE;
		double tempSum = 0;
		
		for(int i = 0;i < nums.length;i++) {
			tempSum += nums[i];
			if(i >= k - 1) {
				maxSum = Math.max(maxSum, tempSum);
				tempSum -= nums[i - (k - 1)];
			}
		}
		
		return maxSum/k;
	}

	public static void main(String[] args) {
		int[] nums = {0,1,1,3,3};
		System.out.println(findMaxAverage(nums, 4));
	}

}
