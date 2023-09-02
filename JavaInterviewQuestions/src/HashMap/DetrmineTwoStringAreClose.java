package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetrmineTwoStringAreClose {

	public static boolean closeStrings(String word1, String word2) {
		HashMap<Character, Integer> hashMap1 = new HashMap<>();
		HashMap<Character, Integer> hashMap2 = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		if(word1.length() != word2.length())
			return false;
		for(int i = 0;i<word1.length();i++) {
			if(hashMap1.containsKey(word1.charAt(i))) {
				hashMap1.put(word1.charAt(i), hashMap1.get(word1.charAt(i)) + 1);
			}
			else {
				hashMap1.put(word1.charAt(i), 1);
			}
			if(hashMap2.containsKey(word2.charAt(i))) {
				hashMap2.put(word2.charAt(i), hashMap2.get(word2.charAt(i)) + 1);
			}
			else {
				hashMap2.put(word2.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e : hashMap1.entrySet()) {
			if(!hashMap2.containsKey(e.getKey()))
				return false;
			list1.add(e.getValue());
		}
		
		for(Map.Entry<Character, Integer> e : hashMap2.entrySet()) {
			list2.add(e.getValue());
		}
		
		Collections.sort(list1);
        Collections.sort(list2);
        if(!list1.equals(list2)) {
        	return false;
        }
		return true;
	}

	public static void main(String[] args) {
		System.out.println(closeStrings("abbzccc", "babzzcz"));

	}

}
