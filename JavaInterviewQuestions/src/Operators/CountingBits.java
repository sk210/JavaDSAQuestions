package Operators;

public class CountingBits {
	
	public static int countOnes(int n) {
		int count = 0;
		
		while(n != 0) {
			count += (n&1);
			n = n>>1;
		}
		return count;
	}

	public static int[] countBits(int n) {
		int[] array = new int[n + 1];
		array[0] = 0;
		for(int i = 1;i <= n;i++) {
			array[i] = countOnes(i);
		}
		
		return array;
	}

	public static void main(String[] args) {

	}

}
