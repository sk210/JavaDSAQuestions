package Array;

public class JumpGame {

	public static boolean canJump(int[] nums) {
		int maxReachable = 0;
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			if (i > maxReachable) {
				return false;
			}
			if (i + nums[i] > maxReachable) {
				maxReachable = i + nums[i];
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println(canJump(nums));

	}

}
