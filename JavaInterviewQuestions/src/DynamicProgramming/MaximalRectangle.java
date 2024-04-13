package DynamicProgramming;

public class MaximalRectangle {

	public static int maximalRectangle(char[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return 0;

		int cols = matrix[0].length;
		int[] height = new int[cols];
		int maxArea = 0;

		for (char[] row : matrix) {
			for (int i = 0; i < cols; i++) {
				height[i] = row[i] == '1' ? height[i] + 1 : 0;
			}

			for (int i = 0; i < cols; i++) {
				int minHeight = Integer.MAX_VALUE;
				for (int j = i; j < cols; j++) {
					minHeight = Math.min(minHeight, height[j]);
					int area = minHeight * (j - i + 1);
					maxArea = Math.max(area, maxArea);
				}
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		System.out.println(maximalRectangle(matrix));

	}

}
