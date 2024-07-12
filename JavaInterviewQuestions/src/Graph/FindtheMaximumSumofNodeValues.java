package Graph;

public class FindtheMaximumSumofNodeValues {

	public static long maximumValueSum(int[] nums, int k, int[][] edges) {
		long total = 0;
        for (int num : nums) {
            total += num;
        }

        long totalDiff = 0;
        long diff;
        int positiveCount = 0;
        long minAbsDiff = Long.MAX_VALUE;
        for (int num : nums) {
            diff = (num ^ k) - num;

            if (diff > 0) {
                totalDiff += diff;
                positiveCount++;
            }
            minAbsDiff = Math.min(minAbsDiff, Math.abs(diff));
        }
        if (positiveCount % 2 == 1) {
            totalDiff -= minAbsDiff;
        }
        return total + totalDiff;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,1};
		int[][] edges = {{0,1},{0,2}};
		System.out.println(maximumValueSum(nums, 3, edges));

	}

}
