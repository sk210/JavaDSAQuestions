package Stack;

import java.util.Stack;

public class DecodeStringAns2 {

	public static String decodeString(String s) {
		Stack<Integer> number = new Stack<Integer>();
		Stack<StringBuilder> finstr = new Stack<StringBuilder>();

		int num = 0;
		StringBuilder str = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				num = num * 10 + (c - '0');
			} else if (c == '[') {
				number.push(num);
				num = 0;
				finstr.push(str);
				str = new StringBuilder();
			} else if (c == ']') {
				StringBuilder temp = str;
				str = finstr.pop();

				int count = number.pop();

				while (count-- > 0) {
					str.append(temp);
				}
			} else {
				str.append(c);
			}
		}

		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(decodeString("3[a]2[bc]"));
	}

}
