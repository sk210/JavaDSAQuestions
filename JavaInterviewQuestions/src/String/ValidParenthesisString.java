package String;

public class ValidParenthesisString {

	public static boolean checkValidString(String s) {
		int leftParenth = 0;
		int rightParenth = 0;
		
		for(char c: s.toCharArray()) {
			leftParenth += c == '(' ? 1 : -1;
			rightParenth += c == ')' ? -1 : 1;
			
			if(rightParenth < 0) return false;
			
			if(leftParenth < 0) leftParenth = 0;
		}
		
		return leftParenth == 0;
	}

	public static void main(String[] args) {
		System.out.println(checkValidString("()"));
	}

}
