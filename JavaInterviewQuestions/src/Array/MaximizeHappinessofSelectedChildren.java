package Array;

import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {

	public static long maximumHappinessSum(int[] happiness, int k) {
		int n = happiness.length;
		int j = 0;
		long res = 0;
		Arrays.sort(happiness);

		for (int i = n - 1; i >= n - k; i--) {
			res += Math.max(happiness[i] - j++, 0);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] happiness = { 1, 2, 3 };
		System.out.println(maximumHappinessSum(happiness, 2));

	}

}
