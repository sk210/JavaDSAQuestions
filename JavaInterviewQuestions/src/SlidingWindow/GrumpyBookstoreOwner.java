package SlidingWindow;

public class GrumpyBookstoreOwner {

	public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
		int n = grumpy.length;
		int max = 0;
		int curr = 0;
		int i = 0;

		for (int j = 0; j < n; j++) {
			curr += customers[j] * grumpy[j];
			max = Math.max(max, curr);
			if (j >= minutes - 1) {
				curr -= customers[i] * grumpy[i++];
			}
		}

		int ans = max;
		for (int j = 0; j < n; j++) {
			ans += customers[j] * (1 - grumpy[j]);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
		int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
		System.out.println(maxSatisfied(customers, grumpy, 3));
	}

}
