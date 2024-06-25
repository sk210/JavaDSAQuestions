package SlidingWindow;

public class MinimumNumberofKConsecutiveBitFlips {

	public static int minKBitFlips(int[] nums, int k) {
		int n = nums.length;
		int flipped = 0;
		int res = 0;
		int[] flippedArr = new int[n];

		for (int i = 0; i < nums.length; i++) {
			if (i >= k) {
				flipped ^= flippedArr[i - k];
			}

			if (flipped == nums[i]) {
				if (i + k > n) {
					return -1;
				}

				flippedArr[i] = 1;
				flipped ^= 1;
				res++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0 };
		System.out.println(minKBitFlips(nums, 1));

	}

}
