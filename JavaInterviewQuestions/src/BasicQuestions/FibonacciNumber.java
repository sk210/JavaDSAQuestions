package BasicQuestions;

public class FibonacciNumber {

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int prev = 1;
		int prev2 = 0;
		
		for(int i = 2;i<=n;i++) {
			int curr = prev + prev2;
			prev2 = prev;
			prev = curr;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		System.out.println(fib(5));

	}
	
}
