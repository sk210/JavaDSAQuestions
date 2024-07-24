package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortthePeople {

	public static String[] sortPeople(String[] names, int[] heights) {
		int n = names.length;
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < n; i++) {
			map.put(heights[i], names[i]);
		}

		Arrays.sort(heights);
		int index = 0;
		for (int i = n - 1; i >= 0; i--) {
			names[index] = map.get(heights[i]);
			index++;
		}

		return names;
	}

	public static void main(String[] args) {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		System.out.println(Arrays.toString(sortPeople(names, heights)));
	}

}
