package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations2 {

	public static void backTrack(int[] nums, List<List<Integer>> list, List<Integer> tempList) {

		if (nums.length == 0) {
			if(!list.contains(tempList)) {
			list.add(new ArrayList<>(tempList));
			}
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			List<Integer> newNums = new ArrayList<>();
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					newNums.add(nums[j]);
				}
			}

			tempList.add(nums[i]);
			backTrack(newNums.stream().mapToInt(Integer::intValue).toArray(), list, tempList);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		backTrack(nums, list, new ArrayList<>());
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2 };
		System.out.println(permuteUnique(arr));
	}

}
