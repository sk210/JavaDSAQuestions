package Array;

import java.util.Arrays;

public class HeightChecker {

	public static int heightChecker(int[] heights) {
		int[] checkerArr = heights.clone();
		Arrays.sort(checkerArr);
		int count = 0;

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != checkerArr[i]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 4, 2, 1, 3 };
		System.out.println(heightChecker(arr));

	}

}
