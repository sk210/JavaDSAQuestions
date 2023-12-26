package DynamicProgramming;

public class JumpGame {

	public static boolean canJump(int[] nums) {
		boolean[] dp = new boolean[nums.length];
		dp[nums.length - 1] = true;
		
		for(int i = nums.length - 2;i >= 0; i--) {
			int furthreJump = Math.min(i + nums[i], nums.length - 1);
			
			for(int j = i + 1;j <= furthreJump;j++) {
				if(dp[j]) {
					dp[i] = true;
					break;
				}
			}
		}
		
		return dp[0];
	}

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));

	}

}
