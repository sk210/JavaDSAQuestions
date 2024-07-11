package Recursion;

public class ReverseSubstringsBetweenEachPairofParentheses {

	static int i = 0;

	public static String helper(char[] arr) {
		StringBuilder sb = new StringBuilder();

		while (i < arr.length) {
			if (arr[i] == ')') {
				i++;
				return sb.reverse().toString();
			} else if (arr[i] == '(') {
				i++;
				String str = helper(arr);
				sb.append(str);
			} else {
				sb.append(arr[i]);
				i++;
			}
		}

		return sb.toString();
	}

	public static String reverseParentheses(String s) {
		return helper(s.toCharArray());
	}

	public static void main(String[] args) {
		System.out.println(reverseParentheses("(abcd)"));

	}

}
