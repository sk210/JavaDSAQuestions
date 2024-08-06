package String;

import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberofPushestoTypeWordII {

	public static int minimumPushes(String word) {
		Integer[] freq = new Integer[26];

		Arrays.fill(freq, 0);

		for (char c : word.toCharArray()) {
			freq[c - 'a']++;
		}

		Arrays.sort(freq, Collections.reverseOrder());

		int totalPress = 0;

		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0)
				break;
			totalPress += (i / 8 + 1) * freq[i];
		}

		return totalPress;
	}

	public static void main(String[] args) {
		System.out.println(minimumPushes("abcde"));
	}

}
