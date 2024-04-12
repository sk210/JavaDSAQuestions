package TwoPointers;

public class TrappingRainWater {

	public static int trap(int[] height) {
		int i = 0, j = height.length - 1;
		int leftMax = height[i], rightSum = height[j];
		int sum = 0;

		while (i < j) {
			if (leftMax <= rightSum) {
				sum += (leftMax - height[i]);
				i++;
				leftMax = Math.max(leftMax, height[i]);
			} else {
				sum += (rightSum - height[j]);
				j--;
				rightSum = Math.max(rightSum, height[j]);
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));
	}

}
