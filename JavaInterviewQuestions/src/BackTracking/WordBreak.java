package BackTracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreak {

	public static boolean helper(String s, Set<String> set, int index, Map<String, Boolean> memo, String value) {
		if (index == s.length()) {
			return set.contains(value);
		}

		String key = value + "_" + index;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		char c = s.charAt(index);

		if (set.contains(value)) {
			if (helper(s, set, index + 1, memo, "" + c)) {
				memo.put(key, true);
				return true;
			}
		}

		memo.put(key, helper(s, set, index + 1, memo, value + c));
		return memo.get(key);
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		Map<String, Boolean> memo = new HashMap<String, Boolean>();
		Set<String> set = new HashSet<String>();
		for (String str : wordDict) {
			set.add(str);
		}
		return helper(s, set, 0, memo, "");
	}

	public static void main(String[] args) {
		String[] wordDict = { "leet", "code" };
		System.out.println(wordBreak("leetcode", Arrays.asList(wordDict)));

	}

}
