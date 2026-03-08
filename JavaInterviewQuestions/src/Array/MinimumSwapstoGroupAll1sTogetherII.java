package Array;

import java.util.Arrays;

public class MinimumSwapstoGroupAll1sTogetherII {

	public static int minSwaps(int[] nums) {
		int k = Arrays.stream(nums).sum();
		int n = nums.length;
		int cnt = 0;
		for (int i = 0; i < k; i++) {
			cnt += nums[i];
		}

		int max = cnt;

		for (int i = k; i < n + k; i++) {
			cnt += nums[i % n] - nums[(i - k + n) % n];
			max = Math.max(max, cnt);
		}

		return k - max;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 1, 1, 0, 0 };
		System.out.println(minSwaps(nums));

	}

}
