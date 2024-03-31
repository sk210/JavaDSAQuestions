package Array;

public class CountSubarraysWithFixedBoundsAns2 {
	
	public static long countSubarrays(int[] nums, int minK, int maxK) {
		long ans = 0;
		int outidx = -1;
		int minidx = -1;
		int maxidx = -1;

		for (int i = 0; i < nums.length; i++) {
			if (minK > nums[i] || nums[i] > maxK) {
				outidx = i;
				minidx = i;
				maxidx = i;
			}

			if (nums[i] == minK) {
				minidx = i;
			}

			if (nums[i] == maxK) {
				maxidx = i;
			}

			ans += Math.min(minidx, maxidx) - outidx;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 2, 7, 5 };
		System.out.println(countSubarrays(nums, 1, 5));

	}

}
