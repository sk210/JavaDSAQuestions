package String;

public class MinimumRemovetoMakeValidParentheses {

	public static String minRemoveToMakeValid(String s) {
		int countOfParen = 0;
		StringBuilder str = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				countOfParen++;
			} else if (s.charAt(i) == ')') {
				if (countOfParen == 0) {
					str.replace(i, i + 1, " ");
				} else {
					countOfParen--;
				}
			}
		}

		int j = s.length() - 1;
		while (countOfParen != 0) {
			if (str.charAt(j) == '(') {
				str.replace(j, j + 1, " ");
				countOfParen--;
			}
			j--;
		}

		return str.toString().replaceAll(" ", "");
	}

	public static void main(String[] args) {
		System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
	}

}
