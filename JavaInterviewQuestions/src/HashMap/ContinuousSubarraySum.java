package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

	public static boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int totalSum = 0;
		map.put(0, -1);

		for (int i = 0; i < nums.length; i++) {
			totalSum += nums[i];

			int reminder = k == 0 ? totalSum : totalSum % k;

			if (map.containsKey(reminder)) {
				if (i - map.get(reminder) > 1) {
					return true;
				}
			} else {
				map.put(reminder, i);
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 23, 2, 4, 6, 7 };
		System.out.println(checkSubarraySum(nums, 6));

	}

}
