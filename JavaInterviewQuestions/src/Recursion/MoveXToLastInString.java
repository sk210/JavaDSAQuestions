package Recursion;

public class MoveXToLastInString {
	
	public static String moveXToLast(String s,int index,int count,String newString) {
		if(index == s.length()) {
			for(int i = 0;i<count;i++) {
				newString += 'x';
			}
			return newString;
		}
		
		if(s.charAt(index) != 'x') {
			newString += s.charAt(index);
			return moveXToLast(s, index+1,count, newString);
		}
		else {
			count++;
			return moveXToLast(s, index+1,count, newString);
		}
	}

	public static void main(String[] args) {
		String s = "abbxcvxxdx";
		System.out.println(moveXToLast(s, 0, 0, ""));

	}

}
