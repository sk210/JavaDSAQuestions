package Operators;

import java.util.Arrays;

public class SingleNumber3 {
	public static int[] singleNumber(int[] nums) {
		int xor = 0;
		for(int num : nums) {
			xor ^= num;
		}
		
		int rightMostBit = 1;
		while((xor & rightMostBit) == 0) {
			rightMostBit <<= 1;
		}
		
		int[] result = new int[2];
		for(int num: nums) {
			if((num & rightMostBit) == 0) {
				result[0] ^= num; 
			}
			else {
				result[1] ^= num;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(singleNumber(nums)));

	}

}
