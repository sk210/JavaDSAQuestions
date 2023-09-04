package Stack;

import java.util.Stack;

public class RemoveStarsFromString {

	public static String removeStars(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '*') {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
			else {
				stack.push(s.charAt(i));
			}
		}
		s = "";
		while(!stack.isEmpty()) {
			s = stack.pop() + s;
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(removeStars("leet**cod*e"));

	}

}
