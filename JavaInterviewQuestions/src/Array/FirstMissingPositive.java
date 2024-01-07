package Array;

public class FirstMissingPositive {

	public static int firstMissingPositive(int[] nums) {
		int i = 0;
		while(i < nums.length) {
			int current = nums[i] - 1;
			if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[current]) {
				int temp = nums[current];
				nums[current] = nums[i];
				nums[i] = temp;
			}
			else {
				i++;
			}
		}
		
		for(int j = 0;j < nums.length;j++) {
			if(nums[j] != j+1) {
				return j+1;
			}
		}
		
		return nums.length + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 1,2,0 };
		System.out.println(firstMissingPositive(nums));
	}

}
