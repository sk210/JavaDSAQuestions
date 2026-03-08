package Array;

public class MaximumSubArray {

	public static int maxSubArray(int[] nums) {
		int maxValue = Integer.MIN_VALUE;
		int currentValue = 0;

		for (int num : nums) {
			currentValue = currentValue + num;
			if (currentValue > maxValue) {
				maxValue = currentValue;
			}
			if (currentValue < 0) {
				currentValue = 0;
			}
		}

		return maxValue;
	}

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}

}
