package BackTracking;

public class MaximumScoreWordsFormedbyLetters {

	public static int helper(String[] words, int[] score, int[] count, int[] letterCount, int pos, int temp, int ans) {
		for (int i = 0; i < 26; i++) {
			if (letterCount[i] > count[i])
				return ans;
		}

		ans = Math.max(ans, temp);

		for (int i = pos; i < words.length; i++) {
			for (char c : words[i].toCharArray()) {
				letterCount[c - 'a']++;
				temp += score[c - 'a'];
			}

			ans = helper(words, score, count, letterCount, i + 1, temp, ans);

			for (char c : words[i].toCharArray()) {
				letterCount[c - 'a']--;
				temp -= score[c - 'a'];
			}
		}

		return ans;
	}

	public static int maxScoreWords(String[] words, char[] letters, int[] score) {
		int[] count = new int[26];
		int[] letterCount = new int[26];

		for (int i = 0; i < letters.length; i++) {
			count[letters[i] - 'a']++;
		}

		return helper(words, score, count, letterCount, 0, 0, 0);

	}

	public static void main(String[] args) {
		String[] words = { "dog", "cat", "dad", "good" };
		char[] letters = { 'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o' };
		int[] score = { 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println(maxScoreWords(words, letters, score));

	}

}
