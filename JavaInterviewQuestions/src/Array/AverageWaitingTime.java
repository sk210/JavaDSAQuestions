package Array;

public class AverageWaitingTime {

	public static double averageWaitingTime(int[][] customers) {
		int n = customers.length;
		double timeWaiting = customers[0][1];
		int prevWaiting = customers[0][0] + customers[0][1];

		for (int i = 1; i < n; i++) {
			int[] time = customers[i];
			int arrives = time[0];

			int startCook = Math.max(prevWaiting, arrives);
			int endTime = startCook + time[1];
			prevWaiting = endTime;
			timeWaiting += endTime - arrives;
		}

		return timeWaiting / n;
	}

	public static void main(String[] args) {
		int[][] customer = { { 1, 2 }, { 2, 5 }, { 4, 3 } };
		System.out.println(averageWaitingTime(customer));
	}

}
