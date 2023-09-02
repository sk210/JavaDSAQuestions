package Array;

import java.util.Arrays;

public class SortArray {
	
	public static int[] sortArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = {8,5,3,9,4,6,7};
		array = sortArray(array);
		System.out.println(Arrays.toString(array));
	}

}
