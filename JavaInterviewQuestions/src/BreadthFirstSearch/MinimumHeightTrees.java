package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MinimumHeightTrees {

	public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
		if(n == 1) return Collections.singletonList(0);
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		int[] ind = new int[n]; 
		
		for(int[] edge: edges) {
			ind[edge[0]]++;
			ind[edge[1]]++;
			
			map.putIfAbsent(edge[0], new ArrayList<Integer>());
			map.putIfAbsent(edge[1], new ArrayList<Integer>());
			map.get(edge[0]).add(edge[1]);
			map.get(edge[1]).add(edge[0]);
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0;i < ind.length;i++) {
			if(ind[i] == 1) {
				queue.add(i);
			}
		}
		
		int processed = 0;
		
		while(n - processed > 2) {
			int size = queue.size();
			processed += size;
			
			for(int i = 0;i < size; i++) {
				int poll = queue.poll();
				for(int adj : map.get(poll)) {
					if(--ind[adj] == 1) queue.add(adj);
				}
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(queue);
		return list;
	}

	public static void main(String[] args) {
		int[][] edges = {{1,0},{1,2},{1,3}};
		System.out.println(findMinHeightTrees(4, edges));

	}

}
