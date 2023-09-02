package HashMap;

import java.util.HashMap;

public class CountOccurences {

	public static HashMap<Integer, Integer> countOccurences(int[] nums) {
		HashMap<Integer, Integer> occurence = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (occurence.containsKey(nums[i])) {
				occurence.put(nums[i], occurence.get(nums[i]) + 1);
			} else {
				occurence.put(nums[i], 1);
			}
		}
		return occurence;
	}

	public static HashMap<Integer, Integer> countOneOccurences(int[] nums, int k) {
		HashMap<Integer, Integer> occurence = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == k) {
				if (occurence.containsKey(nums[i])) {
					occurence.put(nums[i], occurence.get(nums[i]) + 1);
				} else {
					occurence.put(nums[i], 1);
				}
			}
		}
		return occurence;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 4, 5, 6, 3, 2, 34, 3, 2, 2, 1, 4, 5, 5, 63, 2, 1, 1, 3, 4, 5, 1, 4, 5, 7, 7, 64, 4 };
		System.out.println(countOccurences(arr));
		System.out.println(countOneOccurences(arr,1));

	}

}
