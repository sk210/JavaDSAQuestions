package Operators;

public class SingleNumber2 {

	public static int singleNumber(int[] nums) {
		int ans = 0;
		
		for(int i = 0;i< 32;i++) {
			int sum = 0;
			for(int num: nums) {
				sum += num >> i & 1;
			}
			
			sum %= 3;
			ans |= sum << i; 
		}

	    return ans;
	}

	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		System.out.println(singleNumber(nums));
	}

}
