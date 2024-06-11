package Array;

import java.util.Arrays;

public class RelativeSortArray {

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int length = 0;
		for (int i = 0; i < arr1.length; i++) {
			length = Math.max(length, arr1[i]);
		}

		int[] count = new int[length + 1];

		for (int i = 0; i < arr1.length; i++) {
			count[arr1[i]]++;
		}

		int index = 0;

		for (int i = 0; i < arr2.length; i++) {
			while (count[arr2[i]] > 0) {
				arr1[index] = arr2[i];
				index++;
				count[arr2[i]]--;
			}
		}

		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr1[index] = i;
				index++;
				count[i]--;
			}
		}

		return arr1;

	}

	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));

	}

}
