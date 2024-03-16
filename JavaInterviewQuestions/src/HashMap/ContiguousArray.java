package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static int findMaxLength(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int subArray = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] == 0 ? -1 : 1;
			if (sum == 0) {
				subArray = i + 1;
			} else if (map.containsKey(sum)) {
				subArray = Math.max(subArray, i - map.get(sum)); // (i - map.get(sum) we are doing because we need to
																	// remove a subarray from i to get current subarray
																	// )
			} else {
				map.put(sum, i);
			}
		}
		return subArray;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0 };
		System.out.println(findMaxLength(nums));
	}

}
