package Array;

public class MaximumSubArray {

	public static int maxSubArray(int[] nums) {
		int maxValue = Integer.MIN_VALUE;
		int cunrrentValue = 0;
		for(int i = 0;i<nums.length;i++) {
			cunrrentValue += nums[i];
			if(cunrrentValue > maxValue) {
				maxValue = cunrrentValue;
			}
			if(cunrrentValue < 0) {
				cunrrentValue = 0;
			}
			
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}

}
