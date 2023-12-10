package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void helper(int[] candidates, int target, int start, int sum, List<List<Integer>> combinationList,
			List<Integer> combination) {
		if (sum == target) {
			combinationList.add(new ArrayList<>(combination));
			return;
		}
		if (sum > target) {
			return;
		}
		for (int i = start; i < candidates.length; i++) {
			combination.add(candidates[i]);
			helper(candidates, target, i, sum + candidates[i], combinationList, combination);
			combination.remove(combination.size() - 1);
		}
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
		helper(candidates, target, 0, 0, combinationList, new ArrayList<Integer>());
		return combinationList;
	}

	public static void main(String[] args) {
		int[] candidates = { 2, 2, 3, 7 };
		System.out.println(combinationSum(candidates, 7));
	}

}
