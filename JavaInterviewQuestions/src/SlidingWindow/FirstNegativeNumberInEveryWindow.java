package SlidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FirstNegativeNumberInEveryWindow {
	
	public static int[] firstNegativeNumber(int[] nums, int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] arr = new int[nums.length - k + 1];
		int count = 0;
		int i = 0;
		int j = 0;
		
		while(j < nums.length) {
			if(nums[j] < 0) {
				queue.add(nums[j]);
			}
			
			if(j - i + 1 == k) {
				if(!queue.isEmpty()) {
					arr[count] = queue.peek();
					count++;
					if(nums[i] == queue.peek()) {
						queue.poll();
					}
				}
				else {
					arr[count] = 0;
					count++;
				}
				i++;
			}
			j++;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] nums = {12, -1, -7, 8, -15, 30, 16, 28};
		System.out.println(Arrays.toString(firstNegativeNumber(nums, 3)));

	}

}
