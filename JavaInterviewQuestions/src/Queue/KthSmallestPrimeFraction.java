package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {

	public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
		int n = arr.length;
		PriorityQueue<int[]> queue = new PriorityQueue<int[]>(
				(x, y) -> Double.compare((double) y[0] / y[1], (double) x[0] / x[1]));
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				queue.add(new int[] { arr[i], arr[j] });
				if (queue.size() > k)
					queue.poll();
			}
		}

		return queue.poll();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, 3)));

	}

}
