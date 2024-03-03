package DynamicProgramming;

import java.util.Arrays;

public class EditDistanceAns2 {
	
	public static int helper(int i,int j, String s1, String s2, int[][] dp) {
		if(i < 0) {
			return j+1;
		}
		
		if(j < 0) {
			return i + 1;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(s1.charAt(i) == s2.charAt(j)) {
			return dp[i][j] = helper(i-1, j-1, s1, s2, dp);
		}
		else {
			return dp[i][j] = Math.min(helper(i-1, j-1, s1, s2, dp), Math.min(helper(i-1, j, s1, s2, dp), helper(i, j-1, s1, s2, dp))) + 1;
		}
	}

	public static int minDistance(String word1, String word2) {
		if(word1.equals(word2))
			return 0;
		int i = word1.length() - 1;
		int j = word2.length() - 1;
		int[][] dp = new int[i+1][j+1];
		
		for(int[] r: dp) {
			Arrays.fill(r, -1);
		}
		
		return helper(i, j, word1, word2, dp);
	}

	public static void main(String[] args) {
		System.out.println(minDistance("horse", "ros"));
	}

}
