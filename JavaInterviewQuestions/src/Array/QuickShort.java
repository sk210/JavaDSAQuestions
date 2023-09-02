package Array;

import java.util.Arrays;

public class QuickShort {
	
	//pivot and partition
	
	public static int partition(int[] arr,int low,int high) {
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		return i;
		
	}
	
	public static void quickShort(int[] arr,int low,int high) {
		if(low < high) {
			int pidx = partition(arr,low,high);
			
			quickShort(arr, low, pidx - 1);
			quickShort(arr, pidx + 1, high);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,9,7,8,3,6,1,2};
		quickShort(arr,0,arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
