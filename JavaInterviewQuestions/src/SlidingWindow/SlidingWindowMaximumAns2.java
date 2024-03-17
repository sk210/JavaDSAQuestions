package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximumAns2 {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		Deque<Integer> queue = new ArrayDeque<>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			while (!queue.isEmpty() && nums[queue.getLast()] <= nums[i]) {
				queue.removeLast();
			}

			queue.addLast(i);
			
			if (queue.getFirst() == i - k)
				queue.removeFirst();

			if (i >= k - 1)
				list.add(nums[queue.getFirst()]);
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
