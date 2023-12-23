package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LinkedList.LinkedList;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String word : strs) {
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);
			String sortedWord = String.valueOf(charArray);
			map.computeIfAbsent(sortedWord, k -> new ArrayList<String>()).add(word);
		}
		
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));

	}

}
