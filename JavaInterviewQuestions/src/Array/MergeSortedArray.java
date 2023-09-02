package Array;

import java.util.Arrays;

public class MergeSortedArray {

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int[] arr = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<m && j<n) {
			if(nums1[i] < nums2[j]) {
				arr[k++] = nums1[i++];
			}
			else {
				arr[k++] = nums2[j++];
			}
		}
		
		while(i<m) {
			arr[k++] = nums1[i++];
		}
		
		while(j<n) {
			arr[k++] = nums2[j++];
		}
		
		return arr;

	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		System.out.println(Arrays.toString(merge(nums1,3,nums2,3)));
	}

}
