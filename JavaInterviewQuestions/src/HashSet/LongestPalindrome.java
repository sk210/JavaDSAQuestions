package HashSet;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

	public static int longestPalindrome(String s) {
		Set<Character> set = new HashSet<Character>();
		int ans = 0;

		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				ans += 2;
				set.remove(c);
			} else {
				set.add(c);
			}
		}

		if (!set.isEmpty())
			ans++;

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccdd"));

	}

}
