package String;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

	public static List<String> commonChars(String[] words) {
		List<String> ans = new ArrayList<String>();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int minValue = Integer.MAX_VALUE;
			for (String word : words) {
				int count = 0;
				for (char c : word.toCharArray()) {
					if (c == ch) {
						count++;
					}
				}
				minValue = Math.min(minValue, count);
			}
			for (int i = 0; i < minValue; i++) {
				ans.add(String.valueOf(ch));
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		String[] words = { "bella", "label", "roller" };
		System.out.println(commonChars(words));

	}

}
