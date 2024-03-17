package Array;

public class ContiguousArray {

	public static int findMaxLength(int[] nums) {
		int n = nums.length;
		int sum = n;
		int subArray = 0;
		int[] mapArray = new int[2*n+2];
		for(int i = 0;i<n;i++) {
			sum += nums[i] == 0 ? -1 : 1;
			if(sum == n) {
				subArray = i + 1;
			}
			else if(mapArray[sum] == 0) {
				mapArray[sum] = i + 1;
			}
			else {
                subArray = Math.max(subArray, i - mapArray[sum]+1);
            }
		}
		
		return subArray;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0 };
		System.out.println(findMaxLength(nums));
	}

}
