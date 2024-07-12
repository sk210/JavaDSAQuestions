package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisiblebyK {

	public static int subarraysDivByK(int[] nums, int k) {
		int count = 0;
		int prefixSum = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		for (int num : nums) {
			prefixSum += num;
			int mod = prefixSum % k;

			if (mod < 0) {
				mod += k;
			}

			if (map.containsKey(mod)) {
				count += map.get(mod);
				map.put(mod, map.get(mod) + 1);
			} else {
				map.put(mod, 1);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 5, 0, -2, -3, 1 };
		System.out.println(subarraysDivByK(nums, 5));

	}

}
