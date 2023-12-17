package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
	
	public static void helper(List<List<Integer>> subsetsList,List<Integer> subsets,int[] nums,int index) {
		if(index == nums.length) {
			if(!subsetsList.contains(subsets))
			subsetsList.add(new ArrayList<Integer>(subsets));
			return;
		}
		
		subsets.add(nums[index]);
		helper(subsetsList, subsets, nums, index+1);
		subsets.remove(subsets.size() - 1);
		helper(subsetsList, subsets, nums, index+1);
	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> subsetsList = new ArrayList<>();
		List<Integer> subsets = new ArrayList<Integer>();
		Arrays.sort(nums);
		helper(subsetsList, subsets, nums, 0);
		return subsetsList;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		System.out.println(subsetsWithDup(nums));
	}

}
