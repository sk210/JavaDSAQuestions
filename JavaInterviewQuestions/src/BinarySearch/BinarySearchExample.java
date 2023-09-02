package BinarySearch;

public class BinarySearchExample {

	public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + ((end - start)/2);
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        return -1;
        
    }

	public static void main(String[] args) {
		
		
		int[] arr = {-1,0,3,5,9,12};
		int target = 5;
		System.out.println(search(arr,target));

	}

}
