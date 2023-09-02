package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArray {
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> mainList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for(int i = 0;i<nums2.length;i++) {
			set2.add(nums2[i]);
		}
		for(int i = 0;i<nums1.length;i++) {
			if(!set2.contains(nums1[i])) {
				intList.add(nums1[i]);
				set2.add(nums1[i]);
			}
			set1.add(nums1[i]);
		}
		mainList.add(intList);
		intList = new ArrayList<>();
		for(int i = 0;i<nums2.length;i++) {
			if(!set1.contains(nums2[i])) {
				intList.add(nums2[i]);
				set1.add(nums2[i]);
			}
		}
		mainList.add(intList);
		return mainList;

	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};
		System.out.println(findDifference(nums1, nums2));

	}

}
