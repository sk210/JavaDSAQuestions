package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LengthofLongestSubarrayWithatMostKFrequencyAns3 {

	public static int maxSubarrayLength(int[] nums, int k) {
		int i = 0;
		int j = 0;
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (j < nums.length) {
			if (!map.containsKey(nums[j])) {
				map.put(nums[j], 1);
			} else {
				map.put(nums[j], map.get(nums[j]) + 1);
				if (map.get(nums[j]) > k) {
					while (nums[i] != nums[j]) {
						map.put(nums[i], map.get(nums[i]) - 1);
						i++;
					}
					i += 1;
					map.put(nums[j], map.get(nums[j]) - 1);
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
