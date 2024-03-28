package SlidingWindow;

public class LengthofLongestSubarrayWithatMostKFrequencyAns2 {

	public static int maxSubarrayLength(int[] nums, int k) {
		int i = 0;
		int j = 0;
		int ans = 0;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int num : nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		int[] frequencies = new int[max - min + 1];

		while (j < nums.length) {
			frequencies[nums[j] - min]++;
			if (frequencies[nums[j] - min] > k) {
				while (frequencies[nums[j] - min] > k) {
					frequencies[nums[i++] - min]--;
				}
			}
			ans = Math.max(ans, j - i + 1);
			j++;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 2, 3, 1, 2 };
		System.out.println(maxSubarrayLength(nums, 2));

	}

}
