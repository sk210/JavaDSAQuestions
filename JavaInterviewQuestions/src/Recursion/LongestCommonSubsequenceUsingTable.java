package Recursion;

public class LongestCommonSubsequenceUsingTable {
	
	public static int lcsRecursive(String str1, String str2, int m, int n,int[][] dp) {
		if(m == str1.length() || n == str2.length()) {
			return 0;
		}
		
		if(dp[m][n] != 0) {
			return dp[m][n];
		}
		
		int result;
		
		if(str1.charAt(m) == str2.charAt(n)) {
			result = 1 + lcsRecursive(str1, str2, m+1, n+1, dp);
		}
		else {
			result = Math.max(lcsRecursive(str1, str2, m+1, n, dp),lcsRecursive(str1, str2, m, n+1, dp));
		}
		
		dp[m][n] = result;
		return dp[m][n];
	}

	public static int longestCommonSubsequence(String text1, String text2) {
		int[][] dp = new int[text1.length()][text2.length()];
		return lcsRecursive(text1, text2, 0, 0, dp);
	}

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";
		System.out.println(longestCommonSubsequence(text1, text2));
	}

}
