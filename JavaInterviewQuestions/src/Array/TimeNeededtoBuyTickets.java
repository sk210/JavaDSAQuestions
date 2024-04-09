package Array;

public class TimeNeededtoBuyTickets {

	public static int timeRequiredToBuy(int[] tickets, int k) {
		int totalTime = 0;

		for (int i = 0; i < tickets.length; i++) {
			if (i <= k) {
				totalTime += Math.min(tickets[i], tickets[k]);
			} else {
				totalTime += Math.min(tickets[i], tickets[k] - 1);
			}
		}

		return totalTime;
	}

	public static void main(String[] args) {
		int[] tickets = { 2, 3, 2 };
		System.out.println(timeRequiredToBuy(tickets, 2));

	}

}
