package Array;

import java.util.Arrays;

public class MergeSortedArray1 {

	public static void conqure(int[] nums1, int low, int high, int mid) {
		int[] temp = new int[high - low + 1];
		int index1 = low;
		int index2 = mid + 1;
		int index = 0;
		while (index1 <= mid && index2 <= high) {
			if (nums1[index1] <= nums1[index2]) {
				temp[index++] = nums1[index1++];
			} else {
				temp[index++] = nums1[index2++];
			}
		}
		while (index1 <= mid) {
			temp[index++] = nums1[index1++];
		}

		while (index2 <= high) {
			temp[index++] = nums1[index2++];
		}
		for(int i = 0,j=low;i<temp.length;i++,j++) {
			nums1[j] = temp[i];
		}
	}

	public static void mergeShort(int[] nums1, int low, int high) {
		if (low == high) {
			return;
		}
		int mid = low + (high - low) / 2;
		mergeShort(nums1, low, mid);
		mergeShort(nums1, mid + 1, high);
		conqure(nums1, low, high, mid);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m;
		int j = 0;
		while (i <= nums1.length && i < m + n && j < nums2.length) {
			nums1[i++] = nums2[j++];
		}
		mergeShort(nums1, 0, nums1.length - 1);

	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));

	}

}
