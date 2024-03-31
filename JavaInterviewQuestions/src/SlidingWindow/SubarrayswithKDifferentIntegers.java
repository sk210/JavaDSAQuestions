package SlidingWindow;

public class SubarrayswithKDifferentIntegers {

	public static int helper(int[] nums, int k) {
		int[] arr = new int[nums.length + 1];
		int i = 0;
		int j = 0;
		int ans = 0;
		int unique = 0;

		while (j < nums.length) {
			if (++arr[nums[j]] == 1)
				unique++;

			if (unique > k) {
				while (unique > k) {
					if (--arr[nums[i]] == 0)
						unique--;
					i++;
				}
			}
			ans += j - i + 1;
			j++;
		}

		return ans;
	}

	public static int subarraysWithKDistinct(int[] nums, int k) {
		return helper(nums, k) - helper(nums, k - 1);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 2, 3 };
		System.out.println(subarraysWithKDistinct(nums, 2));

	}

}
