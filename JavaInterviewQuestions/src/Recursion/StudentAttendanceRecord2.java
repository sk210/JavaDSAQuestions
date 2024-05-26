package Recursion;

public class StudentAttendanceRecord2 {
	
	public static final int mod = 1000000000 + 7;
	
	public static int helper(int n, int absentRemaining, int lateRemaining) {
		if(n == 0) return 1;
		
		int total = 0;
		
		total += helper(n - 1, absentRemaining, 2);
		
		if(absentRemaining > 0) {
			total += helper(n - 1, absentRemaining - 1, 2);
			total %= mod;
		}
		
		if(lateRemaining > 0) {
			total += helper(n - 1, absentRemaining, lateRemaining - 1);
			total %= mod;
		}
		
		return total;
	}

	public static int checkRecord(int n) {
		return helper(n, 1, 2);
	}

	public static void main(String[] args) {
		System.out.println(checkRecord(2));

	}

}
