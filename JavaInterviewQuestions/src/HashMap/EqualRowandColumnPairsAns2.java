package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualRowandColumnPairsAns2 {

	public static int hasColumn(int j, int[][] grid) {
		int hash = 0;
		for (int i = 0; i < grid.length; i++) {
			hash = grid[i][j] + (13 * hash);
		}
		return hash;
	}

	public static int hasRow(int i, int[][] grid) {
		int hash = 0;
		for (int j = 0; j < grid.length; j++) {
			hash = grid[i][j] + (13 * hash);
		}

		return hash;
	}

	public static int equalPairs(int[][] grid) {
		HashMap<Integer, Integer> columns = new HashMap<>();
        int length = grid.length;;
        for (int i = 0; i < length; i++) {
            int hash = hasColumn(i, grid);
            columns.put(hash, columns.getOrDefault(hash, 0) + 1);
        }

        int pairs = 0;
        for (int i = 0; i < length; i++) {
            int has = hasRow(i, grid);
            pairs += columns.getOrDefault(has, 0);
        }
        
        return pairs;
	}

	public static void main(String[] args) {
		int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
		System.out.println(equalPairs(grid));

	}

}
