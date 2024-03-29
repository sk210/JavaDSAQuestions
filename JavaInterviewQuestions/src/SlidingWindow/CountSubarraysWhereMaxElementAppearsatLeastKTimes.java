package SlidingWindow;

public class CountSubarraysWhereMaxElementAppearsatLeastKTimes {

	public static long countSubarrays(int[] nums, int k) {
		int max = 0;
		int i = 0;
		int j = 0;
		int count = 0;
		long ans = 0;

		for (int num : nums) {
			max = Math.max(max, num);
		}

		while (j < nums.length) {
			if (nums[j] == max) {
				count++;
			}

			if (count >= k) {
				while (count >= k) {
					if (nums[i] == max) {
						count--;
					}
					i++;
				}
			}
			ans += i;
			j++;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 3, 3 };
		System.out.println(countSubarrays(nums, 2));
	}

}
