package BreadthFirstSearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpentheLock {

	public static int openLock(String[] deadends, String target) {
		Set<String> deadendsSet = new HashSet<String>(Arrays.asList(deadends));
		Set<String> visited = new HashSet<String>();
		visited.add("0000");
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("0000");
		
		int level = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				String current = queue.poll();
				if(deadendsSet.contains(current)) continue;
				
				if(target.equals(current)) return level;
				
				for(int j = 0;j < 4; j++) {
					for(int k = -1; k <= 1; k += 2 ) {
						char[] currentarr = current.toCharArray();
						currentarr[j] = (char)(((currentarr[j] - '0') + k + 10) % 10 + '0' );
						String nextValue = new String(currentarr);
						
						if(!visited.contains(nextValue)) {
							visited.add(nextValue);
							queue.offer(nextValue);
						}
					}
				}
			}
			level++;
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] deadends = {"0201","0101","0102","1212","2002"};
		System.out.println(openLock(deadends, "0202"));
	}

}
