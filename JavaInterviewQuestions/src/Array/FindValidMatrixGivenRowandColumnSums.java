package Array;

import java.util.Arrays;

public class FindValidMatrixGivenRowandColumnSums {

	public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int rows = rowSum.length;
		int cols = colSum.length;
		int currRow = 0;
		int currCol = 0;
		int[][] res = new int[rows][cols];

		while (currRow < rows || currCol < cols) {
			if (currRow >= rows) {
				res[rows - 1][currCol] = colSum[currCol];
				currCol++;
				continue;
			} else if (currCol >= cols) {
				res[currRow][cols - 1] = rowSum[currRow];
				currRow++;
				continue;
			}

			int value = Math.min(rowSum[currRow], colSum[currCol]);
			rowSum[currRow] -= value;
			colSum[currCol] -= value;
			res[currRow][currCol] = value;

			if (rowSum[currRow] == 0) {
				currRow++;
			}

			if (colSum[currCol] == 0) {
				currCol++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] rowSum = { 3, 8 };
		int[] colSum = { 4, 7 };
		System.out.println(Arrays.deepToString(restoreMatrix(rowSum, colSum)));

	}

}
