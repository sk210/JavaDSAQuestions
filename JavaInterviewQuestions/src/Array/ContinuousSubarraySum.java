package Array;

public class ContinuousSubarraySum {

	public static boolean checkSubarraySum(int[] nums, int k) {
		int length = nums.length;
		int[] sumArray = new int[length + 1];

		for (int i = 1; i <= length; i++) {
			sumArray[i] = sumArray[i - 1] + nums[i - 1];
		}

		for (int start = 0; start < length - 1; start++) {
			for (int end = start + 1; end < length; end++) {
				int subArraySum = sumArray[start] - sumArray[end + 1];

				if (subArraySum % k == 0) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 23, 2, 4, 6, 7 };
		System.out.println(checkSubarraySum(nums, 6));

	}

}
