package TwoPointers;

import java.util.Arrays;

public class MovesZero2 {
	
	public static void moveZeroes(int[] nums) {
		int i = 0;
		int j = 1;
		while(j < nums.length) {
			if(nums[i] == 0  && nums[j] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
				j++;
			}
			else if(nums[i] == 0 && nums[j] == 0) {
				j++;
			}
			else {
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

}
