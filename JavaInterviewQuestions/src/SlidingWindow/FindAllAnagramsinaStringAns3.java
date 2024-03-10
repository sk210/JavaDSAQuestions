package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsinaStringAns3 {

	public static List<Integer> findAnagrams(String s, String p) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		int i = 0;
		int j = 0;
		int length = p.length();
		for (char c : p.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
				count++;
			}
		}

		while (j < s.length()) {
			if (map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
				if (map.get(s.charAt(j)) == 0) {
					count--;
				}
			}

			if (j - i + 1 == length) {
				if (count == 0) {
					list.add(i);
				}

				if (map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
					if(map.get(s.charAt(i)) == 1)
						count++;
				}
				i++;
			}
			j++;
		}
		return list;

	}

	public static void main(String[] args) {
		System.out.println(findAnagrams("cbaebabacd", "abc"));

	}

}
