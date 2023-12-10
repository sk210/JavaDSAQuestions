package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsAns2 {
	
	public static void backTrack(int start, int[] nums, List<List<Integer>> ans) {
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
        for (int j = start; j < nums.length; j++) {
            int temp = nums[start];
            nums[start] = nums[j];
            nums[j] = temp;

            backTrack(start + 1, nums, ans);
            
            temp = nums[start];
            nums[start] = nums[j];
            nums[j] = temp;
        }
    }

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		backTrack(0, nums, ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(permute(arr));

	}

}
