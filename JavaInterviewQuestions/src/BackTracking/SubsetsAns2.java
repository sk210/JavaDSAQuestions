package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsAns2 {

	public static void helper(int[] nums, List<List<Integer>> subsetsList, List<Integer> list, int index) {
		if (index == nums.length) {
			subsetsList.add(new ArrayList<Integer>(list));
			return;
		}

		list.add(nums[index]);
		helper(nums, subsetsList, list, index + 1);
		list.remove(list.size() - 1);
		helper(nums, subsetsList, list, index + 1);
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
