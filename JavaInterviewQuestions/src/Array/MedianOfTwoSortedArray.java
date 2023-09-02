package Array;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
	
	public static Double medianOfTwoSortedArray(int[] nums1,int[] nums2) {
		int[] arr = new int[nums1.length + nums2.length];
		int i = 0,j=0,k=0;
		while(j < nums1.length && k < nums2.length) {
			if(nums1[j] <= nums2[k] ) {
				arr[i] = nums1[j];
				j++;
				i++;
			}
			else {
				arr[i] = nums2[k];
				k++;
				i++;
			}
		}
		
		while(j<nums1.length) {
			arr[i] = nums1[j];
			j++;
			i++;
		}
		while(k<nums2.length) {
			arr[i] = nums2[k];
			k++;
			i++;
		}
		int mid = 0 + (arr.length-1 - 0)/2;
		if(arr.length % 2 == 0) {
			return (arr[mid] + arr[mid + 1])/2D;
		}
		else {
			return (double) arr[mid];
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {1,3};
		int[] arr2 = {2};
		Double d = medianOfTwoSortedArray(arr1, arr2);
		System.out.println(d);

	}

}
