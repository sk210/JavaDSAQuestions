package BinarySearch;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,4,5,5,5,6,6,6,6,9,9,9,10,11};
		int target = 6;
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		int first = 0;
		int last = 0;
		while(start<=end) {
			mid = start + ((end-start)/2);
			if(arr[mid] == target) {
				first = mid;
				end = mid - 1;
			}
			else if(arr[mid]<target) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
			
		}
		
		
		start = 0;
		end = arr.length-1;
		while(start<=end) {
			mid = start + ((end-start)/2);
			if(arr[mid] == target) {
				last = mid;
				start = mid + 1;
			}
			else if(arr[mid]<target) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
			
		}
		System.out.println(first);
		System.out.println(last);
	}

}
