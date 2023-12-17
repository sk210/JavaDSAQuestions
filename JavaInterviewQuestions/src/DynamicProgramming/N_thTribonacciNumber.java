package DynamicProgramming;

public class N_thTribonacciNumber {

	public static int tribonacci(int n) {
		
		int[] arr = new int[n+3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for(int i = 3;i<=n;i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i - 3];
		}
		
		return arr[n];
	}
	

	public static void main(String[] args) {
		System.out.println(tribonacci(25));

	}

}
