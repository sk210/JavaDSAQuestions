package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int num: nums2) {
			if(map.containsKey(num)) {
				list.add(num);
				map.remove(num);
			}
		}
		
		int[] result = new int[list.size()];
		for(int i = 0;i< list.size();i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));

	}

}
