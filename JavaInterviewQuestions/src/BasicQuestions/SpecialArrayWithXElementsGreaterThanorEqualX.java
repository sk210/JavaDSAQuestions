package BasicQuestions;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {

	public static int specialArray(int[] nums) {
		Arrays.sort(nums);
		int length = nums.length;

		if (nums[0] >= length)
			return length;

		for (int i = 1; i <= length; i++) {
			if (nums[length - i] >= i && nums[length - i - 1] < i) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 5 };
		System.out.println(specialArray(nums));

	}

}
