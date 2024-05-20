package DepthFirstSearch;

public class SumofAllSubsetXORTotals {

	public static int dfs(int[] nums, int index, int currentXor) {
		if (index == nums.length)
			return currentXor;

		return dfs(nums, index + 1, currentXor ^ nums[index]) + dfs(nums, index + 1, currentXor);
	}

	public static int subsetXORSum(int[] nums) {
		return dfs(nums, 0, 0);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3 };
		System.out.println(subsetXORSum(nums));

	}

}
