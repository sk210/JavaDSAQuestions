package Array;

import java.util.HashMap;

public class FindPivotIndex {

	public static int pivotIndex(int[] nums) {
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			sum += nums[i];
			map.put(i, sum);
		}
		for(int i = 0;i< nums.length;i++) {
			if((map.get(i) - nums[i]) == (sum-map.get(i))){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {2,1,-1};
		System.out.println(pivotIndex(nums));
	}

}
