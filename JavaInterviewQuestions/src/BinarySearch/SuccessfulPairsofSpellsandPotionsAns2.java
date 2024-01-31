package BinarySearch;

import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotionsAns2 {

	public static int[] successfulPairs(int[] spells, int[] potions, long success) {
		Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int l = 0;
            int r = potions.length;
            while (l < r) {
                int m = l + (r - l) / 2;
                if ((long) spells[i] * potions[m] >= success) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            spells[i] = potions.length - l;
        }
        return spells;
	}

	public static void main(String[] args) {
		int[] spells = { 5, 1, 3 };
		int[] potions = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(successfulPairs(spells, potions, 7)));

	}

}
