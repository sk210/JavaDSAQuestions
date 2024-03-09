package SlidingWindow;

public class MaximumAverageSubarray1Ans2 {

	public static double findMaxAverage(int[] nums, int k) {
		double maxSum = Integer.MIN_VALUE;
		double tempSum = 0;
		int i = 0;
		int j = 0;
		
		while(j < nums.length) {
			tempSum += nums[j];
			if(j-i+1 == k) {
				maxSum = Math.max(maxSum, tempSum);
				tempSum -= nums[i]; 
				i++;
			}
			j++;
		}
		return maxSum / k;
	}

	public static void main(String[] args) {
		int[] nums = { 1,12,-5,-6,50,3 };
		System.out.println(findMaxAverage(nums, 4));

	}

}
