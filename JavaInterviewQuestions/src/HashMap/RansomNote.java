package HashMap;

import java.util.HashMap;

//ransomNote all character should be in magazine
//ransomNote = aa,magazine = aba return true;
//ransomNote = ab,magazine = aca return false;

public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
		if (magazine.length() < ransomNote.length())
			return false;
		int i = 0;
		HashMap<Character, Integer> ransomnotemap = new HashMap<>();
		HashMap<Character, Integer> magazinemap = new HashMap<>();
		while (i < ransomNote.length()) {
			if (ransomnotemap.containsKey(ransomNote.charAt(i))) {
				ransomnotemap.put(ransomNote.charAt(i), ransomnotemap.get(ransomNote.charAt(i)) + 1);
			} else {
				ransomnotemap.put(ransomNote.charAt(i), 1);
			}
			if (magazinemap.containsKey(magazine.charAt(i))) {
				magazinemap.put(magazine.charAt(i), magazinemap.get(magazine.charAt(i)) + 1);
			} else {
				magazinemap.put(magazine.charAt(i), 1);
			}
			i++;
		}
		if (i < magazine.length()) {
			while (i < magazine.length()) {
				if (magazinemap.containsKey(magazine.charAt(i))) {
					magazinemap.put(magazine.charAt(i), magazinemap.get(magazine.charAt(i)) + 1);
				} else {
					magazinemap.put(magazine.charAt(i), 1);
				}
				i++;
			}
		}

		for (int j = 0; j < ransomNote.length(); j++) {
			if (ransomnotemap.containsKey(ransomNote.charAt(j))) {
				if (magazinemap.containsKey(ransomNote.charAt(j))) {
					if (ransomnotemap.get(ransomNote.charAt(j)) > magazinemap.get(ransomNote.charAt(j)))
						return false;
				} else {
					return false;
				}
			}
		}
		return true;

	}

	
	public static boolean canConstruct2(String ransomNote,String magazine) {
		if (magazine.length() < ransomNote.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i<magazine.length();i++) {
			if(map.containsKey(magazine.charAt(i))) {
				map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
			}
			else {
				map.put(magazine.charAt(i), 1);
			}
		}
		for(int i = 0;i<ransomNote.length();i++) {
			if(map.containsKey(ransomNote.charAt(i))) {
				if(map.get(ransomNote.charAt(i)) > 0) {
					map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(canConstruct2("aa", "aba"));

	}

}
