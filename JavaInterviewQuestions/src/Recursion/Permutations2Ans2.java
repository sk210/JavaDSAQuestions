package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations2Ans2 {

	public static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	public static void process(int[] nums, int i, List<List<Integer>> ans) {
		if (i == 0) {
			List<Integer> t = new ArrayList<>();
			for (int n : nums) {
				t.add(n);
			}
			ans.add(t);
			return;
		}

		boolean[] isUsed = new boolean[21];
		for (int j = i; j != -1; j--) {
			int p = nums[j] + 10;
			if (isUsed[p]) {
				continue;
			}
			isUsed[p] = true;
			swap(nums, i, j);
			process(nums, i - 1, ans);
			swap(nums, i, j);
		}
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return ans;
		}

		int l = nums.length;
		process(nums, l - 1, ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 };
		System.out.println(permuteUnique(nums));

	}

}
