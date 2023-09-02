package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {

	public static boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
		if (pattern.length() != arr.length)
			return false;
		HashMap<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if(!map.get(pattern.charAt(i)).equals(arr[i].trim()))
					return false;
			}else{
				if(map.containsValue(arr[i].trim()))
					return false;
				map.put(pattern.charAt(i), arr[i].trim());
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));

	}

}
