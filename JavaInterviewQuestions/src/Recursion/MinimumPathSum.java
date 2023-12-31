package Recursion;

import java.util.HashMap;
import java.util.Map;

public class MinimumPathSum {

	public static int helper(int[][] grid, int i, int j, int m, int n, Map<String, Integer> memo) {
		if(i == m || j == n) {
			return Integer.MAX_VALUE;
		}
		
		String key = i + "," + j;
		if(memo.containsKey(key)) {
			return memo.get(key);
		}
		
		if(i == m - 1 && j == n - 1) {
			return grid[i][j];
		}
		
		int down = helper(grid, i + 1, j, m, n, memo);
		int right = helper(grid, i, j + 1, m, n, memo);
		
		int result = grid[i][j] + Math.min(down, right);
		memo.put(key, result);
		
		return result;
	}

	public static int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		Map<String, Integer> memo = new HashMap<>();
		return helper(grid, 0, 0, m, n, memo);
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(minPathSum(grid));
	}

}
