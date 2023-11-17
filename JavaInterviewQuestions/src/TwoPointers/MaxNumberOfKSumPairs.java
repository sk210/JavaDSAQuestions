package TwoPointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {

	public static int maxOperations(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		int counter = 0;
		while(i<j) {
			if((nums[i] + nums[j]) == k) {
				counter++;
				i++;
				j--;
			}
			else if((nums[i] + nums[j]) < k) {
				i++;
			}
			else {
				j--;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(maxOperations(nums, 5));
	}

}
