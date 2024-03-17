package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<int[]>();
		int i = 0;
		
		while(i < intervals.length && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}
		
		while(i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
			newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
			i++;
		}
		
		result.add(newInterval);
		
		while(i < intervals.length) {
			result.add(intervals[i]);
			i++;
		}
		
		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = {{1,3}, {6,9}};
		int[] newInterval = {2,5};
		
		System.out.println(Arrays.deepToString(insert(intervals, newInterval)));

	}

}
