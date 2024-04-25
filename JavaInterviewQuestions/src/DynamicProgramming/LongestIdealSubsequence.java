package DynamicProgramming;

public class LongestIdealSubsequence {

	public static int longestIdealString(String s, int k) {
		int[] dp = new int[27];
		int n = s.length();
		int ans = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < n; i++) {
			char ch = s.charAt(i);
			int idx = ch - 'a';
			
			int left = Math.max(idx - k, 0);
			int right = Math.min(idx + k, 26);
			
			int max = Integer.MIN_VALUE;
			while(left <= right) {
				max = Math.max(max, dp[left]);
				left++;
			}
			dp[idx] = max + 1;
			ans = Math.max(ans, max + 1);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(longestIdealString("acfgbd", 2));

	}

}
