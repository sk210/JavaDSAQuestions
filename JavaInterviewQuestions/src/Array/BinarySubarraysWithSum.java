package Array;

public class BinarySubarraysWithSum {

	public static int numSubarraysWithSum(int[] nums, int goal) {
		int totalSum = 0;
		int sum = 0;
		int[] prefixSum = new int[nums.length + 1];
		prefixSum[0] = 1;
		for(int num: nums) {
			sum += num;
			
			if(sum >= goal) {
				totalSum += prefixSum[sum - goal];
			}
			prefixSum[sum]++;
		}
		
		return totalSum;
	}

	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1};
		System.out.println(numSubarraysWithSum(nums, 2));

	}

}
