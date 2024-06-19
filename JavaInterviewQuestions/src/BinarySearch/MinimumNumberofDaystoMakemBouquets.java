package BinarySearch;

public class MinimumNumberofDaystoMakemBouquets {

	public static int minDays(int[] bloomDay, int m, int k) {
		int s = 0;
		int e = (int) 1e9;
		int ans = -1;

		while (s <= e) {
			int buk = 0;
			int con = 0;

			int mid = s + (e - s) / 2;
			for (int i = 0; i < bloomDay.length; i++) {
				if (bloomDay[i] <= mid) {
					con++;
					if (con >= k) {
						buk++;
						con = 0;
					}
				} else {
					con = 0;
				}
			}

			if (buk >= m) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] bloomDay = { 7, 7, 7, 7, 12, 7, 7 };
		System.out.println(minDays(bloomDay, 2, 3));

	}

}
