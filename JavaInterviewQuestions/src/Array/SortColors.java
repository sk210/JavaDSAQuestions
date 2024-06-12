package Array;

import java.util.Arrays;

public class SortColors {

	public static void conqure(int[] nums, int si, int ei, int mid) {
		int[] merge = new int[ei - si + 1];
		int index1 = si;
		int index2 = mid + 1;
		int index = 0;

		while (index1 <= mid && index2 <= ei) {
			if (nums[index1] <= nums[index2]) {
				merge[index++] = nums[index1++];
			} else {
				merge[index++] = nums[index2++];
			}
		}

		while (index1 <= mid) {
			merge[index++] = nums[index1++];
		}

		while (index2 <= ei) {
			merge[index++] = nums[index2++];
		}

		for (int i = 0, j = si; i < merge.length; i++, j++) {
			nums[j] = merge[i];
		}
	}

	public static void divided(int[] nums, int si, int ei) {
		if (si >= ei)
			return;
		int mid = si + (ei - si) / 2;
		divided(nums, si, mid);
		divided(nums, mid + 1, ei);
		conqure(nums, si, ei, mid);
	}

	public static void sortColors(int[] nums) {
		divided(nums, 0, nums.length - 1);
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

}
