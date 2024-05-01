package Operators;

public class NumberofWonderfulSubstrings {

	public static long wonderfulSubstrings(String word) {
		long[] count = new long[1024];
		long result = 0;
		int xor = 0;
		count[xor] = 1;

		for (char ch : word.toCharArray()) {
			int index = ch - 'a';
			xor ^= 1 << index;
			result += count[xor];
			for (int i = 0; i < 10; i++) {
				result += count[xor ^ (1 << i)];
			}
			count[xor]++;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(wonderfulSubstrings("aba"));

	}

}
