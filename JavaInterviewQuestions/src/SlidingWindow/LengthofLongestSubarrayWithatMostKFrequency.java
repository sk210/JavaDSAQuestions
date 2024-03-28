package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LengthofLongestSubarrayWithatMostKFrequency {

	public static int maxSubarrayLength(int[] nums, int k) {
		if (k == 0) {
			return 0;
		}

		int i = 0;
		int j = 0;
		int ans = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		while (j < nums.length) {
			map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
			if (map.get(nums[j]) > k) {
				while (map.get(nums[j]) > k) {
					map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
					i++;
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
