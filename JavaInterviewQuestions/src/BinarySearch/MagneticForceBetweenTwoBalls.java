package BinarySearch;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {

	public static boolean canReplace(int[] postion, int mid, int ball) {
		int cntBalls = 1;
		int last = postion[0];

		for (int i = 0; i < postion.length; i++) {
			if (postion[i] - last >= mid) {
				cntBalls++;
				last = postion[i];
			}

			if (cntBalls >= ball) {
				return true;
			}
		}

		return false;
	}

	public static int maxDistance(int[] position, int m) {
		Arrays.sort(position);
		int lo = 1;
		int hi = (position[position.length - 1] - position[0]) / (m - 1);
		int ans = 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (canReplace(position, mid, m)) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] postion = { 1, 2, 3, 4, 7 };
		System.out.println(maxDistance(postion, 3));

	}

}
