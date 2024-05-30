package Operators;

public class CountTripletsThatCanFormTwoArraysofEqualXOR {

	public static int countTriplets(int[] arr) {
		int length = arr.length;
		int count = 0;
		int[] prefix = new int[length + 1];
		
		for(int i = 0; i < length; i++) {
			prefix[i + 1] = arr[i] ^ prefix[i];
		}
		
		for(int i = 0; i < length; i++) {
			for(int k = i + 1; k < length; k++) {
				if(prefix[i] == prefix[k + 1]) {
					count += k - i;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 6, 7};
		System.out.println(countTriplets(arr));

	}

}
