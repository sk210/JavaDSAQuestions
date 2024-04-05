package Stack;

import java.util.Stack;

public class MakeTheStringGreat {

	public static String makeGood(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		StringBuilder str = new StringBuilder();

		while (!stack.isEmpty()) {
			str.insert(0, stack.pop());
		}

		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(makeGood("leEeetcode"));

	}

}
