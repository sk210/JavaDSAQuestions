package Stack;

import java.util.Stack;

public class RemoveKDigits {

	public static String removeKdigits(String num, int k) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < num.length(); i++) {
			while (!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
				stack.pop();
				k--;
			}
			stack.push(num.charAt(i));
		}

		while (k > 0 && !stack.isEmpty()) {
			stack.pop();
			k--;
		}

		StringBuilder str = new StringBuilder();

		while (!stack.isEmpty()) {
			str.append(stack.pop());
		}

		str.reverse();

		while (str.length() > 0 && str.charAt(0) == '0') {
			str.deleteCharAt(0);
		}

		return str.length() > 0 ? str.toString() : "0";
	}

	public static void main(String[] args) {
		System.out.println(removeKdigits("1432219", 3));

	}

}
