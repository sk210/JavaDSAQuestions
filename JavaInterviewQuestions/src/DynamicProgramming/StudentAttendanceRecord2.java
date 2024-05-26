package DynamicProgramming;

import java.util.Arrays;

public class StudentAttendanceRecord2 {
	
	public static final int mod = 1000000000 + 7;

	public static int checkRecord(int n) {
		int[][] prevDp = new int[2][3];
		prevDp[0][0] = 1;
		prevDp[0][1] = 1;
		prevDp[0][2] = 1;
		prevDp[1][0] = 1;
		prevDp[1][1] = 1;
		prevDp[1][2] = 1;
		
		for(int i = 1; i <= n; i++) {
			int[][] newDp = new int[2][3];
			for(int a = 0; a < 2; a++) {
				for(int l = 0; l < 3; l++) {
					newDp[a][l] += prevDp[a][2];
					
					if(a > 0) {
						newDp[a][l] += prevDp[a - 1][2];
						newDp[a][l] %= mod;
					}
					
					if(l > 0) {
						newDp[a][l] += prevDp[a][l - 1];
						newDp[a][l] %= mod;
					}
				}
			}
			prevDp = newDp;
		}
		
		return prevDp[1][2];
	}

	public static void main(String[] args) {
		System.out.println(checkRecord(2));

	}

}
