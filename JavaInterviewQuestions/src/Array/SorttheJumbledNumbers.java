package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SorttheJumbledNumbers {

	public static int translateInteger(int num, int[] mapping) {
		char[] digits = Integer.toString(num).toCharArray();
		for (int i = 0; i < digits.length; i++) {
			digits[i] = (char) ('0' + mapping[digits[i] - '0']);
		}

		return Integer.parseInt(new String(digits));
	}

	public static int[] sortJumbled(int[] mapping, int[] nums) {
		Map<Integer, Integer> numberMapping = new HashMap<>();

		for (int num : nums) {
			if (!numberMapping.containsKey(num)) {
				numberMapping.put(num, translateInteger(num, mapping));
			}
		}

		Integer[] numBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Arrays.sort(numBoxed, (a, b) -> Integer.compare(numberMapping.get(a), numberMapping.get(b)));

		for (int i = 0; i < nums.length; i++) {
			nums[i] = numBoxed[i];
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] mapping = { 8, 9, 4, 0, 2, 1, 3, 5, 7, 6 };
		int[] nums = { 991, 338, 38 };
		System.out.println(Arrays.toString(sortJumbled(mapping, nums)));
	}

}
