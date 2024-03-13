package BinarySearch;

public class FindthePivotInteger {

	public static int pivotInteger(int n) {
		int left = 1; 
		int right = n;
		int fullSum = (n * (n + 1))/2;
		while(left <= right) {
			int mid = left + (right - left)/2;
			int firstSum = (mid * (mid+1))/2;
			int secondSum = fullSum - firstSum + mid;
			if(firstSum == secondSum) {
				return mid;
			}else if(firstSum < secondSum) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(pivotInteger(8));

	}

}
