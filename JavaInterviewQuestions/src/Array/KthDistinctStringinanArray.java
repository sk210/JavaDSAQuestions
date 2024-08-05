package Array;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringinanArray {

	public static String kthDistinct(String[] arr, int k) {
		Map<String, Integer> counter = new HashMap<String, Integer>();
		for (String str : arr) {
			counter.put(str, counter.getOrDefault(str, 0) + 1);
		}

		for (String str : arr) {
			if (counter.get(str) == 1) {
				k--;

				if (k == 0) {
					return str;
				}
			}
		}

		return "";
	}

	public static void main(String[] args) {
		String[] arr = { "d", "b", "c", "b", "c", "a" };
		System.out.println(kthDistinct(arr, 2));

	}

}
