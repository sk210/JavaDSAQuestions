package Stack;

import java.util.Stack;

public class DecodeString {

	public static String decodeString(String s) {
		Stack<String> stack = new Stack<String>();
		
		for(int i = 0;i<s.length();i++) {
			char charcter = s.charAt(i);
			if (Character.isDigit(charcter)) {
	            int count = 0;
	            while (i < s.length() && Character.isDigit(s.charAt(i))) {
	                count = count * 10 + (s.charAt(i) - '0');
	                i++;
	            }
	            i--;

	            stack.push(String.valueOf(count));
	        }
			else if(charcter == ']') {
				String str = "";
				while(!stack.peek().equals("[")) {
					str = stack.pop() + str;
				}
				
				stack.pop();
				int count = Integer.valueOf(stack.pop());
				System.out.println(count);
				String strpush = str;
				while(count > 1) {
					strpush += str;
					count--;
				}
				stack.push(strpush);
			}
			else {
				stack.push(String.valueOf(charcter));
			}
		}
		
		StringBuilder result = new StringBuilder();
	    for (String element : stack) {
	        result.append(element);
	    }

	    return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(decodeString("3[a]2[bc]"));
	}

}
