package Array;

import java.util.Arrays;

public class HandofStraights {

	public static boolean helper(int[] hand, int groupSize, int n, int i) {
		int temp = hand[i] + 1;
		hand[i] = -1;
		int count = 1;
		i += 1;

		while (i < n && count < groupSize) {
			if (hand[i] == temp) {
				temp = hand[i] + 1;
				hand[i] = -1;
				count++;
			}
			i++;
		}

		if (count != groupSize)
			return false;

		return true;
	}

	public static boolean isNStraightHand(int[] hand, int groupSize) {
		int n = hand.length;
		if (n % groupSize != 0)
			return false;

		Arrays.sort(hand);

		for (int i = 0; i < n; i++) {
			if (hand[i] >= 0) {
				if (!helper(hand, groupSize, n, i))
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] hand = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
		System.out.println(isNStraightHand(hand, 3));

	}

}
