package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak2 {

	public static List<String> helper(String s, int start, Set<String> set) {
		List<String> validSubString = new ArrayList<String>();

		if (start == s.length()) {
			validSubString.add("");
		}

		for (int end = start + 1; end <= s.length(); end++) {
			String prefix = s.substring(start, end);
			if (set.contains(prefix)) {
				List<String> suffixs = helper(s, end, set);
				for (String suffix : suffixs) {
					validSubString.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
				}
			}
		}

		return validSubString;
	}

	public static List<String> wordBreak(String s, List<String> wordDict) {
		Set<String> set = new HashSet<>(wordDict);
		return helper(s, 0, set);
	}

	public static void main(String[] args) {
		String[] wordDict = { "cat", "cats", "and", "sand", "dog" };
		System.out.println(wordBreak("catsanddog", Arrays.asList(wordDict)));

	}

}
