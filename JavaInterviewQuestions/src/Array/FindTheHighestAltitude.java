package Array;

public class FindTheHighestAltitude {
	public static int largestAltitude(int[] gain) {
		int largeAlt = 0;
		int calAlt = 0;
		for(int i = 0;i<gain.length;i++) {
			calAlt += gain[i];
			largeAlt = Math.max(largeAlt,calAlt);
		}
		return largeAlt;
	}

	public static void main(String[] args) {
		int[] gain = {-5,1,5,0,-7};
		System.out.println(largestAltitude(gain));

	}

}
