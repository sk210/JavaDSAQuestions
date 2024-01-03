package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EqualRowandColumnPairs {

	public static int equalPairs(int[][] grid) {
		Map<Integer, ArrayList<Integer>> row = new HashMap<Integer, ArrayList<Integer>>();
		Map<Integer, ArrayList<Integer>> col = new HashMap<Integer, ArrayList<Integer>>();
		
		int n = grid.length;
		
		for(int i = 0;i < n;i++) {
			row.put(i, new ArrayList<Integer>());
			col.put(i, new ArrayList<Integer>());
		}
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				row.get(i).add(grid[i][j]);
				col.get(j).add(grid[i][j]);
			}
		}
		
		int ans = 0;
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j < n;j++) {
				if(row.get(i).equals(col.get(j))) {
					ans++;
				}
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[][] grid= {{3,2,1},{1,7,6},{2,7,7}};
		System.out.println(equalPairs(grid));

	}

}
