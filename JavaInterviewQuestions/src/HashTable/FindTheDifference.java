package HashTable;

import java.util.Hashtable;

public class FindTheDifference {

	public static char findTheDifference(String s, String t) {
		Hashtable<Character, Integer> tabHashtable = new Hashtable<>();
		for (int i = 0; i < s.length(); i++) {
			if (tabHashtable.containsKey(s.charAt(i))) {
				tabHashtable.put(s.charAt(i), tabHashtable.get(s.charAt(i)) + 1);
			} else {
				tabHashtable.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (tabHashtable.containsKey(t.charAt(i))) {
				if (tabHashtable.get(t.charAt(i)) <= 0)
					return t.charAt(i);
				else {
					tabHashtable.put(t.charAt(i), tabHashtable.get(t.charAt(i)) - 1);
				}
			}
			else {
				return t.charAt(i);
			}
		}
		return 'n';
	}

	public static void main(String[] args) {
		System.out.println(findTheDifference("a", "aa"));
	}

}
