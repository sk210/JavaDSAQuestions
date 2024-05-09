package HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

	public static String[] findRelativeRanks(int[] score) {
		Integer[] storedScore = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
		String[] medals = { "Gold Medal", "Silver Medal", "Bronze Medal" };
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < storedScore.length; i++) {
			if (i < 3) {
				map.put(storedScore[i], medals[i]);
			} else {
				map.put(storedScore[i], String.valueOf(i + 1));
			}
		}

		String[] results = new String[score.length];

		for (int i = 0; i < score.length; i++) {
			results[i] = map.get(score[i]);
		}

		return results;
	}

	public static void main(String[] args) {
		int[] score = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(findRelativeRanks(score)));

	}

}
