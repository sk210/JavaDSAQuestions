package Array;

public class PatchingArray {

	public static int minPatches(int[] nums, int n) {
		long miss = 1;
		int result = 0;
		int i = 0;

		while (miss <= n) {
			if (i < nums.length && nums[i] <= miss) {
				miss += nums[i];
				i++;
			} else {
				miss += miss;
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3 };
		System.out.println(minPatches(nums, 6));

	}

}
