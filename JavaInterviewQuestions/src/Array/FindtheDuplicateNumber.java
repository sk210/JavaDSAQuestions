package Array;

public class FindtheDuplicateNumber {

	public static int findDuplicate(int[] nums) {
		boolean[] boolArray = new boolean[nums.length];
		
		for(int num: nums) {
			if(boolArray[num]) {
				return num;
			}
			boolArray[num]= true;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));

	}

}
