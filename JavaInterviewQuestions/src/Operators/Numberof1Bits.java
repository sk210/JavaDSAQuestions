package Operators;

public class Numberof1Bits {

	public static int hammingWeight(int n) {
		int counter = 0;
		
		while(n != 0) {
			counter++;
			n &= (n-1);
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(hammingWeight(00000000000000000000000000001011));
	}

}
