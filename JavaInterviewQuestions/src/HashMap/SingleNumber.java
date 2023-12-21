package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0;i<nums.length;i++) {
			if(hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
			}else {
				hashMap.put(nums[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
			if(e.getValue() == 1) {
				return e.getKey();
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));

	}

}
