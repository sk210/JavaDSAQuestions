package Recursion;

public class FactorialNumberUsingRecursion {
	
	public static int FactorialNumberUsingRec(int num) {
		if(num > 1) {
			return num*FactorialNumberUsingRec(num - 1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(FactorialNumberUsingRec(6));
	}

}
