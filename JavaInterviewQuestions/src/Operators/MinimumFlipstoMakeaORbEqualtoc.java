package Operators;

public class MinimumFlipstoMakeaORbEqualtoc {

	public static int minFlips(int a, int b, int c) {
		int count = 0;
		while (c > 0) {
			if ((c & 1) == 1) {
				if ((a & 1) != 1 && (b & 1) != 1) {
					count++;
				}
			}
			else {
				if((a&1) == 1)
				count++;
				if((b&1) == 1)
				count++;
			}
			
			a >>= 1;
			b >>= 1;
			c >>= 1;
		}
		while(a > 0) {
			if((a&1) == 1)
				count++;
			a >>= 1;
		}
		
		while(b > 0) {
			if((b&1) == 1)
				count++;
			b >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(minFlips(10, 9, 1));

	}

}
