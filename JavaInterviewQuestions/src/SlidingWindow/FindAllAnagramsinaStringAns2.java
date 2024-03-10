package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaStringAns2 {

	public static List<Integer> findAnagrams(String s, String p) {
		int[] a = new int[26];
		int[] b = new int[26];
		int length = p.length();
		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (char c : p.toCharArray()) {
			a[c - 'a']++;
		}

		while (j < s.length()) {
			b[s.charAt(j) - 'a']++;
			if (j - i + 1 == length) {
				boolean bb = true;
				for (int k = 0; k < 26; k++) {
					if (a[k] != b[k])
						bb = false;
				}
				if (bb)
					list.add(i);
				b[s.charAt(i) - 'a']--;
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
