package Array;

import java.util.Arrays;

public class MergeShort {
	
	public static void conqure(int[] arr,int si,int mid,int ei) {
		int[] merge = new int[ei - si + 1];
		int indx1 = si;
		int indx2 = mid + 1;
		int indx = 0;
		
		while(indx1<= mid && indx2 <= ei) {
			if(arr[indx1] <= arr[indx2]) {
				merge[indx++] = arr[indx1++];
			}
			else {
				merge[indx++] = arr[indx2++];
			}
		}
		
		while(indx1 <= mid) {
			merge[indx++] = arr[indx1++];
		}
		
		while(indx2 <= ei) {
			merge[indx++] = arr[indx2++];
		}
		
		for(int i = 0,j = si;i<merge.length;i++,j++) {
			arr[j] = merge[i];
		}
		
	}
	
	public static void divied(int[] arr,int si,int ei) {
		if(si >= ei) {
			return;
		}
		int mid = si + (ei-si)/2;
		divied(arr,si,mid);
		divied(arr,mid+1,ei);
		conqure(arr,si,mid,ei);
	}

	public static void main(String[] args) {
		int[] arr = {4,3,7,2,9,5,6,4};
		divied(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

}
