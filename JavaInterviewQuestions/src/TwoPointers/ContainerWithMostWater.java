package TwoPointers;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int value = 0;
		while(i < j) {
			int newHeight = (j-i)*Math.min(height[i], height[j]);
			if(newHeight > value) {
				value = newHeight;
			}
			if(height[i] < height[j]) {
				i++;
			}
			else {
				j--;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
