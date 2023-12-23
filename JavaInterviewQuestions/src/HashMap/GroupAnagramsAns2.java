package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagramsAns2 {
	
	
	public static String generateKey(String str) {
		char[] chars = new char[26];
		for(char ch : str.toCharArray()) {
			chars[ch - 'a']++;
		}
		
		return String.valueOf(chars);
	}
	
	
	public static List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<String, List<String>>();
       for(String str : strs) {
    	   String key = generateKey(str);
    	   map.computeIfAbsent(key, k -> new LinkedList<String>()).add(str);
       }
       return new ArrayList<>(map.values());
    }

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));

	}

}
