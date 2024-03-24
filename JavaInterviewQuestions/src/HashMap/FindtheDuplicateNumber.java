package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindtheDuplicateNumber {

	public static int findDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums) {
			if(map.containsKey(num)) {
				return num;
			}
			else {
				map.put(num, 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));

	}

}
