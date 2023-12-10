package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum2 {
	
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
			if (i > start && candidates[i] == candidates[i - 1])
                continue;
			if(candidates[i]>target) break;
			combination.add(candidates[i]);
			helper(candidates, target, i+1, sum + candidates[i], combinationList, combination);
			combination.remove(combination.size() - 1);
		}
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> combinationList = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		helper(candidates, target, 0, 0, combinationList, new ArrayList<Integer>());
		return combinationList;
	}

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		System.out.println(combinationSum2(candidates, 8));
	}

}
