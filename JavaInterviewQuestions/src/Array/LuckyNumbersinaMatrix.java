package Array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {

	public static List<Integer> luckyNumbers(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int num = Integer.MAX_VALUE;
			int index = -1;
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] < num) {
					num = matrix[i][j];
					index = j;
				}
			}

			boolean flag = true;
			for (int row = 0; row < n; row++) {
				if (matrix[row][index] > num)
					flag = false;
			}
			if (flag)
				list.add(num);
		}

		return list;
	}

	public static void main(String[] args) {
		int[][] arr = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
		System.out.println(luckyNumbers(arr));

	}

}
