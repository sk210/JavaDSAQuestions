package Recursion;

public class SingleNumber {
	
	public static int recursiveXor(int[] nums, int i) {
        if(i >= nums.length) 
			return 0;
        return nums[i] ^ recursiveXor(nums, ++i);
    }
	
	public static int singleNumber(int[] nums) {
        return recursiveXor(nums, 0);
    }

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}

}
