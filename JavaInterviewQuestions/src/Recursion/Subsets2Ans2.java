package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2Ans2 {
	
	public static void helper(List<List<Integer>> subsetsList,List<Integer> subsets,int[] nums,int index) {
		
		subsetsList.add(new ArrayList<>(subsets));
		for(int i = index;i<nums.length;i++) {
			if(i > index && nums[i] == nums[i-1]) {
				continue;
			}
			subsets.add(nums[i]);
			helper(subsetsList, subsets, nums, i+1);
			subsets.remove(subsets.size() - 1);
		}
		
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
