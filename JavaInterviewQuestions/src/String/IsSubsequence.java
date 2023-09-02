package String;

public class IsSubsequence {

	public static boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		while(i < s.length() && j < t.length()) {
			if(s.charAt(i) != t.charAt(j)) {
				j++;
			}
			else {
				i++;
				j += 2;
			}
		}
		if(i == s.length()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgdc"));

	}

}
