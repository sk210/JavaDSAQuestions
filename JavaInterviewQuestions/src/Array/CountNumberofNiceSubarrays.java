package Array;

public class CountNumberofNiceSubarrays {

	public static int numberOfSubarrays(int[] nums, int k) {
		int ans = 0;
		int oddCount = 0;
		int[] prefixCount = new int[nums.length + 1];
		prefixCount[0] = 1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				oddCount++;
			}

			if (oddCount >= k) {
				ans += prefixCount[oddCount - k];
			}

			prefixCount[oddCount]++;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 1, 1 };
		System.out.println(numberOfSubarrays(nums, 3));
	}

}
