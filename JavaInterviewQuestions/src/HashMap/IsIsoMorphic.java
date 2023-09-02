package HashMap;

import java.util.HashMap;

//s = paper,t = title
//p => t
//a => i
//e => l 
//r => e

public class IsIsoMorphic {

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (!map.get(s.charAt(i)).equals(t.charAt(i)))
					return false;
			}
			else {
				if(map.containsValue(t.charAt(i)))
					return false;
			}
			map.put(s.charAt(i), t.charAt(i));
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("paper", "title"));

	}

}
