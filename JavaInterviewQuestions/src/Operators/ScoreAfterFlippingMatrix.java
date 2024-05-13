package Operators;

public class ScoreAfterFlippingMatrix {

	public static int matrixScore(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int res = (1 << (m - 1)) * n;

		for (int i = 1; i < m; i++) {
			int curr = 0;
			for (int j = 0; j < n; j++) {
				if (grid[j][i] == grid[j][0]) {
					curr++;
				}
			}

			res += (1 << (m - i - 1)) * Math.max(curr, n - curr);
		}

		return res;
	}

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
		System.out.println(matrixScore(grid));
	}

}
