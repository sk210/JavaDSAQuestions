package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	
	public static void helper(int[] nums,List<List<Integer>> subsetsList,List<Integer> list,int index) {
		
		subsetsList.add(new ArrayList<Integer>(list));
		
		for(int i = index;i<nums.length;i++) {
			list.add(nums[i]);
			helper(nums, subsetsList, list, i+1);
			list.remove(list.size() - 1);
		}
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> subsetsList = new ArrayList<List<Integer>>();
		helper(nums, subsetsList, new ArrayList<Integer>(), 0);
		return subsetsList;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(subsets(arr));

	}

}
