package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int i = 0;
		int j = 0;
		Deque<Integer> queue = new ArrayDeque<>();
		List<Integer> list = new ArrayList<Integer>();

		while (j < nums.length) {
			while (!queue.isEmpty() && nums[j] >= nums[queue.getLast()]) {
				queue.removeLast();
			}
			queue.addLast(j);

			if (j - i + 1 == k) {
				list.add(nums[queue.getFirst()]);

				if (queue.getFirst() == i) {
					queue.removeFirst();
				}

				i++;
			}
			j++;
		}

		int[] result = new int[list.size()];
	    for (int m = 0; m < list.size(); m++) {
	        result[m] = list.get(m);
	    }
	    return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 1, 2, 0, 5 };
		System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
	}

}
