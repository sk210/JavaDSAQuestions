package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>(nums1.length);
		Set<Integer> set2 = new HashSet<Integer>();
		for(int num: nums1) {
			set1.add(num);
		}
		
		for(int num: nums2) {
			if(set1.contains(num)) {
				set2.add(num);
				set1.remove(num);
			}
		}
		
		int[] result = new int[set2.size()];
		int j = 0;
		for(int value: set2) {
			result[j++] = value;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));

	}

}
