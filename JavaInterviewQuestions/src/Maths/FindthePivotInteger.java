package Maths;

public class FindthePivotInteger {
	
	public static int pivotInteger(int n) {
		int ans = (n*(n+1))/2;
		int sq = (int) Math.sqrt(ans);
		if(sq*sq == ans) return sq;
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(pivotInteger(8));
	}

}
