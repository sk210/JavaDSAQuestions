package Array;

import java.util.Arrays;

public class IntersectionofTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int i = 0, j = 0, k = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		while (i < length1 && j < length2) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				nums1[k++] = nums1[i++];
				j++;
			}
		}
		return Arrays.copyOfRange(nums1, 0, k);
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}

}
