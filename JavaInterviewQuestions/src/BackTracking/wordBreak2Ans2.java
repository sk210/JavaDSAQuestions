package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak2Ans2 {

	public static void helper(String s, Set<String> wordSet, StringBuilder currentSentence, List<String> result,
			int startIndex) {
		if(startIndex == s.length()) {
			result.add(currentSentence.toString().trim());
			return;
		}
		
		for(int end = startIndex + 1; end <= s.length(); end++) {
			String subStr = s.substring(startIndex, end);
			if(wordSet.contains(subStr)) {
				int currentLength = currentSentence.length();
				currentSentence.append(subStr + " ");
				helper(s, wordSet, currentSentence, result, end);
				currentSentence.setLength(currentLength);
			}
		}
	}

	public static List<String> wordBreak(String s, List<String> wordDict) {
		Set<String> wordSet = new HashSet<String>(wordDict);
		List<String> result = new ArrayList<String>();
		helper(s, wordSet, new StringBuilder(), result, 0);
		return result;
	}

	public static void main(String[] args) {
		String[] wordDict = { "cat", "cats", "and", "sand", "dog" };
		System.out.println(wordBreak("catsanddog", Arrays.asList(wordDict)));

	}

}
