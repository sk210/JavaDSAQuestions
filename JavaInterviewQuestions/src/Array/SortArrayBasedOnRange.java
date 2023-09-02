package Array;

import java.util.Arrays;

public class SortArrayBasedOnRange {
	
	public static int[] sort(int[] arr) {
		int[] temparray = new int[arr.length];
		int[] number = {0,1,2};
		int count = 0;
		for(int i = 0;i<number.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(number[i] == arr[j]) {
					temparray[count] = arr[j];
					count++;
				}
			}
		}
		return temparray;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,1,2,2,0,0,2,1,2,2,1};
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
