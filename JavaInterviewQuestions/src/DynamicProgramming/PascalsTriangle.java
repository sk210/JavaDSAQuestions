package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
		int[][] dp = new int[numRows][numRows];
		
		dp[0][0] = 1;
		for(int i = 1;i<numRows;i++) {
			for(int j = 0;j< numRows;j++) {
				if(j == 0) {
					dp[i][j] = 1;
					continue;
				}
				else if(i == numRows - 1 && j == numRows - 1) {
					dp[i][j] = 1;
				}
				else {
					dp[i][j] = dp[i - 1][j-1] + dp[i - 1][j];
				}
			}
		}
		
		List<List<Integer>> convertedList = new ArrayList<>();
		for(int[] row:dp) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0;i<row.length;i++) {
				if(row[i] != 0) {
					list.add(row[i]);
				}
				else {
					break;
				}
			}
			convertedList.add(list);
		}
		
		return convertedList;
		
	}

	public static void main(String[] args) {
		System.out.println(generate(5));

	}

}
