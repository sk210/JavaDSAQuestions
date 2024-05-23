package BackTracking;

import java.util.HashMap;
import java.util.Map;

public class TheNumberofBeautifulSubsets {

	public static int helper(int[] nums, int k, int index, Map<Integer, Integer> memo) {
		if (nums.length == index)
			return 1;

		int taken = 0;

		if (!memo.containsKey(nums[index] - k) && !memo.containsKey(nums[index] + k)) {
			memo.put(nums[index], memo.getOrDefault(nums[index], 0) + 1);
			taken = helper(nums, k, index + 1, memo);
			memo.put(nums[index], memo.get(nums[index]) - 1);
			if (memo.get(nums[index]) == 0) {
				memo.remove(nums[index]);
			}
		}

		int notTaken = helper(nums, k, index + 1, memo);

		return taken + notTaken;
	}

	public static int beautifulSubsets(int[] nums, int k) {
		Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
		int ans = helper(nums, k, 0, memo);
		return ans - 1;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 2, 5, 9, 10, 3 };
		System.out.println(beautifulSubsets(nums, 1));
	}

}
