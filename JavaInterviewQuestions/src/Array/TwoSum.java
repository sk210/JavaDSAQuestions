package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			
			if(map.containsKey(target - num)) {
				return new int[] {map.get(target - num), i};
			}
			
			map.put(num, i);
		}
		
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] array = {2,7,11,15};
		
		System.err.println(Arrays.toString(twoSum(array, 9)));

	}

}
