package HashSet;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {

	public static int findMaxK(int[] nums) {
		int ans = -1;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num : nums) {
			set.add(num);
			int k = num * (-1);
			if(set.contains(k)) {
				ans = Math.max(ans, Math.abs(k));
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {-1,2,-3,3};
		System.out.println(findMaxK(nums));

	}

}
