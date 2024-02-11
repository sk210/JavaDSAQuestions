package BinarySearch;

public class KokoEatingBananas {
	
	public static boolean check(int maxBanana, int[] piles, int hour) {
		int hours = 0;
		
		for(int pile : piles) {
			hours += pile/maxBanana;
			if(pile%maxBanana != 0) hours++;
		}
		
		if(hours <= hour) return true;
		
		return false;
	}

	public static int minEatingSpeed(int[] piles, int h) {
		int low = 1;
		int high = Integer.MIN_VALUE;
		for(int i = 0;i<piles.length;i++) {
			high = Math.max(high, piles[i]);
		}
		
		while(low<high) {
			int mid = low + (high - low)/2;
			
			if(check(mid, piles, h)) {
				high = mid;
			}
			else {
				low = mid + 1;
			}
		}
		
		return low;
	}

	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		System.out.println(minEatingSpeed(piles, 8));

	}

}
