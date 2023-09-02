package BasicQuestions;

public class RemoveDuplicateElement {
	
	public static int removeDeplicate(int[] arr,int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		int[] temp = new int[n];
		for(int i = 0;i<arr.length - 1;i++) {
			if(arr[i] != arr[i++]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		length = removeDeplicate(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

	}

}
