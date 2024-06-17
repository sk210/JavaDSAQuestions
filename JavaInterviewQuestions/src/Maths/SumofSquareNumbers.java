package Maths;

public class SumofSquareNumbers {

	public static boolean judgeSquareSum(int c) {
		for (long divisor = 0; divisor * divisor <= c; divisor++) {
			double value = Math.sqrt(c - divisor * divisor);
			if (value == (int) value)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(judgeSquareSum(5));

	}

}
