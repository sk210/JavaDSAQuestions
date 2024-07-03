package Array;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves {

	public static int minDifference(int[] nums) {
		int n = nums.length;
		if (n <= 4)
			return 0;
		Arrays.sort(nums);
		int ans = nums[n - 1] - nums[0];
		for (int i = 0; i <= 3; i++) {
			ans = Math.min(ans, nums[n - (3 - i) - 1] - nums[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {5, 3, 2, 4};
		System.out.println(minDifference(nums));

	}

}
