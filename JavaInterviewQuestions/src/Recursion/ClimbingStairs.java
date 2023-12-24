package Recursion;

public class ClimbingStairs {
	
	public static int helper(int n,int index,int[] dp) {
		if(index == n) {
			return 1;
		}
		
		if(index > n) {
			return 0;
		}
		
		if(dp[index] != 0) {
			return dp[index];
		}
		int count;
		
		count =+ helper(n, index + 1,dp);
		dp[index] = count;
		
		count += helper(n, index + 2,dp);
		dp[index] = count;
		
		return dp[index];
	}

	public static int climbStairs(int n) {
		int[] dp = new int[n+1];
		return helper(n, 0,dp);
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

}
