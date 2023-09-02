package BinarySearch;

public class SearchInRotatedSortedArray {

	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(nums[mid] == target) {
				return mid;
			}

			if(nums[low] == nums[mid]){
				low++;
				continue;
			}
			
			if(nums[low] <= nums[mid]) {
				if(nums[low] <= target && target <= nums[mid]) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			else {
				if(nums[mid] <= target && target <= nums[high]) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = {5,6,0,1,2,3,4};
		System.out.println(search(nums, 0));

	}

}
