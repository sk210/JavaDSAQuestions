package Recursion;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubsequence2 {
	
	public static int lcsRecursive(String str1, String str2, int m, int n,Map<String,Integer> memo) {
        if (m == 0 || n == 0) {
            return 0;
        }
        
        String key = m + "," + n;
        if(memo.containsKey(key)) {
        	return memo.get(key);
        }
        int result;

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            result = 1 + lcsRecursive(str1.substring(0, m - 1), str2.substring(0, n - 1), m - 1, n - 1,memo);
        } else {
            result = Math.max(
                    lcsRecursive(str1, str2.substring(0, n - 1), m, n - 1,memo),
                    lcsRecursive(str1.substring(0, m - 1), str2, m - 1, n,memo)
            );
        }
        memo.put(key, result);
        return memo.get(key);
    }

	public static int longestCommonSubsequence(String text1, String text2) {
		Map<String,Integer> memo = new HashMap<>();
		 return lcsRecursive(text1, text2, text1.length(), text2.length(),memo);
	}

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";
		System.out.println(longestCommonSubsequence(text1, text2));

	}

}
