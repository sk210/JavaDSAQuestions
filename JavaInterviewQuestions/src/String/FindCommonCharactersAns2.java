package String;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharactersAns2 {

	public static int[] count(String word) {
		int[] temp = new int[26];
		for (char c : word.toCharArray()) {
			temp[c - 'a']++;
		}
		return temp;
	}

	public static int[] intersection(int[] a, int[] b) {
		int[] temp = new int[26];
		for (int i = 0; i < 26; i++) {
			temp[i] = Math.min(a[i], b[i]);
		}
		return temp;
	}

	public static List<String> commonChars(String[] words) {
		int[] last = count(words[0]);
		List<String> ans = new ArrayList<String>();
		for (int i = 1; i < words.length; i++) {
			last = intersection(last, count(words[i]));
		}

		for (int i = 0; i < 26; i++) {
			if (last[i] != 0) {
				char c = 'a';
				c += i;

				while (last[i] > 0) {
					ans.add(String.valueOf(c));
					last[i]--;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String[] words = { "bella", "label", "roller" };
		System.out.println(commonChars(words));

	}

}
