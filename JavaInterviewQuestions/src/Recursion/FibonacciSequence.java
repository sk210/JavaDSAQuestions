package Recursion;

public class FibonacciSequence {
	
	public static int fibonacciSequence(int number) {
		if(number == 1) {
			return 0;
		}
		if(number == 2) {
			return 1;
		}
		int first = fibonacciSequence(number - 1);
		int second = fibonacciSequence(number - 2);
		return first + second;   
	}

	public static void main(String[] args) {
		System.out.println(fibonacciSequence(9));

	}

}
