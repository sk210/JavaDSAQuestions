package HashMap;

import java.util.HashMap;

public class MinimumCommonValue {

	public static int getCommon(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0;i< nums1.length;i++) {
			map.put(nums1[i], nums1[i]);
		}
		
		for(int i = 0;i< nums2.length;i++) {
			if(map.containsKey(nums2[i])) {
				return nums2[i];
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4};
		System.out.println(getCommon(nums1, nums2));
	}

}
