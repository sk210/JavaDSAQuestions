package Recursion;

public class SubSequences {
	
	public static void subSequences(String str,int index,String newString) {
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
		subSequences(str, index+1, newString + str.charAt(index));
		subSequences(str, index+1, newString);
	}

	public static void main(String[] args) {
		String str = "abc";
		subSequences(str, 0, "");

	}

}
