package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumCosttoHireKWorkers {

	public static class Pair<K, V> {
		private final K key;
		private final V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}

	public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		List<Pair<Double, Integer>> ratio = new ArrayList<>();
		int n = quality.length, qualitySum = 0;
		double res = Double.MAX_VALUE, maxRate = 0.0;

		for (int i = 0; i < n; ++i) {
			ratio.add(new Pair<>((double) wage[i] / quality[i], i));
		}

		ratio.sort(Comparator.comparingDouble(p -> p.getKey()));
		for (int i = 0; i < k; ++i) {
			qualitySum += quality[ratio.get(i).getValue()];
			maxRate = Math.max(maxRate, ratio.get(i).getKey());
			maxHeap.offer(quality[ratio.get(i).getValue()]);
		}

		res = maxRate * qualitySum;
		for (int i = k; i < n; ++i) {
			maxRate = Math.max(maxRate, ratio.get(i).getKey());
			qualitySum -= maxHeap.poll();
			qualitySum += quality[ratio.get(i).getValue()];
			maxHeap.offer(quality[ratio.get(i).getValue()]);
			res = Math.min(res, maxRate * qualitySum);
		}

		return res;
	}

	public static void main(String[] args) {
		int[] quality = { 10, 20, 5 };
		int[] wage = { 70, 50, 30 };
		System.out.println(mincostToHireWorkers(quality, wage, 2));
	}

}
