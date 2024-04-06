package Stack;

import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {

	public static String minRemoveToMakeValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int leftParentheses = 0;
		int rightParentheses = 0;

		for (int i = 0; i < s.length(); i++) {
			char cuurchar = s.charAt(i);

			if (cuurchar == '(') {
				leftParentheses++;
			}

			if (cuurchar == ')') {
				rightParentheses++;
			}

			if (rightParentheses > leftParentheses) {
				rightParentheses--;
				continue;
			} else {
				stack.push(cuurchar);
			}
		}

		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			char currentChar = stack.pop();
			if (leftParentheses > rightParentheses && currentChar == '(') {
				leftParentheses--;
			} else {
				result.append(currentChar);
			}
		}
		return result.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));

	}

}
