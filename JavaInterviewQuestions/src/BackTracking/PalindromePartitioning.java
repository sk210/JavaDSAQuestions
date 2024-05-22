package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	
	public static boolean isPalindrome(String s, int left, int right) {
		while(left < right) {
			if(s.charAt(left++) != s.charAt(right--)) return false;
		}
		
		return true;
	}
	
	public static void helper(String s, List<List<String>> palindromeList, List<String> list, int start) {
		if(start == s.length()) {
			palindromeList.add(new ArrayList<String>(list));
			return;
		}
		
		for(int end = start + 1; end <= s.length(); end++) {
			if(isPalindrome(s, start, end - 1)) {
				list.add(s.substring(start, end));
				helper(s, palindromeList, list, end);
				list.remove(list.size() - 1);
			}
		}
	}

	public static List<List<String>> partition(String s) {
		List<List<String>> palindromeList = new ArrayList<List<String>>();
		helper(s, palindromeList, new ArrayList<String>(), 0);
		return palindromeList;
	}

	public static void main(String[] args) {
		System.out.println(partition("aab"));

	}

}
