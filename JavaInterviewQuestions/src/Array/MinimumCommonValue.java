package Array;

public class MinimumCommonValue {

	public static int getCommon(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int length1 = nums1.length;
		int length2 = nums2.length;
		if (nums1[length1 - 1] < nums2[0] || nums1[0] > nums2[length2 - 1] || nums2[length2 - 1] < nums1[0]
				|| nums2[0] > nums1[length1 - 1])
			return -1;
		while(i < length1 && j < length2) {
			if(nums1[i] == nums2[j]) {
				return nums2[j];
			}
			else if(nums1[i] < nums2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4};
		System.out.println(getCommon(nums1, nums2));

	}

}
