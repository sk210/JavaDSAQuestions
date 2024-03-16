package Array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int zeroCount = 0;
		int multiplication = 1;
		
		for(int i = 0;i< nums.length;i++) {
			if(nums[i] == 0) {
				zeroCount++;
			}
			else {
				multiplication *= nums[i];
			}
		}
		
		for(int i = 0;i< nums.length;i++) {
			if(zeroCount > 0) {
				if(zeroCount == 1) {
					if(nums[i] == 0) {
						nums[i] = multiplication;
					}
					else {
						nums[i] = 0;
					}
				}
				else {
					nums[i] = 0;
				}
			}
			else {
				nums[i] = multiplication / nums[i];
			}
		}
		
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

}
