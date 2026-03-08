package Queue;

import java.util.PriorityQueue;

public class KthLargestElementinaStream {

	public int k;
	public PriorityQueue<Integer> minHeap;

	public KthLargestElementinaStream(int k, int[] nums) {
		this.k = k;
		minHeap = new PriorityQueue<Integer>(k);
		for (int num : nums) {
			if (minHeap.size() < k) {
				minHeap.offer(num);
			} else if (num > minHeap.peek()) {
				minHeap.offer(num);
				if (minHeap.size() > k) {
					minHeap.poll();
				}
			}
		}
	}

	public int add(int val) {
		if (minHeap.size() < k) {
			minHeap.offer(val);
		} else if (val > minHeap.peek()) {
			minHeap.offer(val);
			minHeap.poll();
		}

		return minHeap.peek();
	}

	public static void main(String[] args) {
		KthLargestElementinaStream obj = new KthLargestElementinaStream(3, new int[] { 4, 5, 8, 2 });
		int val1 = obj.add(3);
		int val2 = obj.add(5);
		int val3 = obj.add(10);
		int val4 = obj.add(9);
		int val5 = obj.add(4);
		System.out.println(val1 + " " + val2 + " " + val3 + " " + val4 + " " + val5);

	}

}
