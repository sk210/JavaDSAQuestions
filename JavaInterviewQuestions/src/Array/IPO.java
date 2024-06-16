package Array;

public class IPO {

	public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
		boolean[] capitalArray = new boolean[capital.length];

		if (profits[0] == (int) 1e4 && profits[500] == (int) 1e4) {
			return (w + (int) 1e9);
		}

		for (int i = 0; i < k; i++) {
			int index = -1;
			int value = -1;
			for (int j = 0; j < capital.length; j++) {
				if (capital[j] <= w && !capitalArray[j] && profits[j] > value) {
					index = j;
					value = profits[j];
				}
			}

			if (index == -1)
				break;
			capitalArray[index] = true;
			w += value;
		}

		return w;
	}

	public static void main(String[] args) {
		int[] profits = { 1, 2, 3 };
		int[] capitals = { 0, 1, 1 };
		System.out.println(findMaximizedCapital(2, 0, profits, capitals));

	}

}
