package Operators;

public class MinimumNumberofOperationstoMakeArrayXOREqualtoK {

	public static int minOperations(int[] nums, int k) {
		int xor = 0;
		int ans = 0;
		
		for(int num : nums) {
			xor ^= num;
		}
		
		xor ^= k;
		
		while(xor > 0) {
			if((xor & 1) != 0) ans++;
			xor >>= 1;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {2,1,3,4};
		System.out.println(minOperations(nums, 1));
	}

}
