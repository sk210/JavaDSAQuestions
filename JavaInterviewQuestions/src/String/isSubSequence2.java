package String;

public class isSubSequence2 {
	
	public static boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		if(s.length() == 0) {
			return true;
		}
		while(j< t.length()) {
			if(s.charAt(i) == t.charAt(j)) {
				i++;
			}
			if(i == s.length()) {
				return true;
			}
			j++;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "abc"));

	}

}
