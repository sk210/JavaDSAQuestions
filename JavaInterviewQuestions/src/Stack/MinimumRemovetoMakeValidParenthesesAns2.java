package Stack;

import java.util.Stack;

public class MinimumRemovetoMakeValidParenthesesAns2 {

	public static String minRemoveToMakeValid(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder str = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else if (s.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					str.replace(i, i + 1, " ");
				}
			}
		}

		while (!stack.isEmpty()) {
			int i = stack.pop();
			str.replace(i, i + 1, " ");
		}

		return str.toString().replaceAll(" ", "");
	}

	public static void main(String[] args) {
		System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));

	}

}
