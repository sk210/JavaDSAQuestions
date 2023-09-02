package BasicQuestions;

import java.util.Arrays;

public class MoveNegativeNumbers {
	
	public static boolean moveNegativeNumber(int[] arr)  {
		int j = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < 0) {
				if(i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {15, -2, 4, 8, -9, 5, 10, -23, -1, -10};
		boolean value = moveNegativeNumber(arr);
		if(value) {
			System.out.println(Arrays.toString(arr));
		}

	}

}
