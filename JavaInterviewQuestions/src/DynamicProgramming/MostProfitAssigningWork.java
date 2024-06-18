package DynamicProgramming;

public class MostProfitAssigningWork {

	public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
		int maxDifficulty = 0;
		for (int i = 0; i < difficulty.length; i++) {
			maxDifficulty = Math.max(maxDifficulty, difficulty[i]);
		}

		int[] maxProfitDiffuculty = new int[maxDifficulty + 1];

		for (int i = 0; i < difficulty.length; i++) {
			maxProfitDiffuculty[difficulty[i]] = Math.max(maxProfitDiffuculty[difficulty[i]], profit[i]);
		}

		for (int i = 1; i <= maxDifficulty; i++) {
			maxProfitDiffuculty[i] = Math.max(maxProfitDiffuculty[i], maxProfitDiffuculty[i - 1]);
		}

		int totalProfit = 0;
		for (int ability : worker) {
			if (ability > maxDifficulty) {
				totalProfit += maxProfitDiffuculty[maxDifficulty];
			} else {
				totalProfit += maxProfitDiffuculty[ability];
			}
		}

		return totalProfit;
	}

	public static void main(String[] args) {
		int[] difficulty = { 2, 4, 6, 8, 10 };
		int[] profit = { 10, 20, 30, 40, 50 };
		int[] worker = { 4, 5, 6, 7 };

		System.out.println(maxProfitAssignment(difficulty, profit, worker));

	}

}
