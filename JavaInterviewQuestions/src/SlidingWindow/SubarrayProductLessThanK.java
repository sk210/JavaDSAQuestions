package SlidingWindow;

public class SubarrayProductLessThanK {

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1)
			return 0;

		int i = 0, j = 0, product = 1, count = 0;

		while (j < nums.length) {
			product *= nums[j];
			if (product >= k) {
				while (product >= k) {
					product /= nums[i++];
				}
			}
			count += j - i + 1;
			j++;
		}

		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 10, 5, 2, 6 };
		System.out.println(numSubarrayProductLessThanK(nums, 100));
	}

}
