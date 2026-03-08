package String;

public class SecondLargestDigit {

	public static int secondHighest(String s) {
		int first = -1;
		int second = -1;

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				int digit = c - '0';

				if (digit > first) {
					second = first;
					first = digit;
				} else if (first > digit && second < digit) {
					second = digit;
				}
			}
		}
		return second;
	}

	public static void main(String[] args) {
		System.out.println(secondHighest("dfa12321afd"));
	}

}
