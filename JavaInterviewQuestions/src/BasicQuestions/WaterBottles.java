package BasicQuestions;

public class WaterBottles {

	public static int numWaterBottles(int numBottles, int numExchange) {
		int totalBottles = numBottles;

		while (numBottles >= numExchange) {
			totalBottles += numBottles / numExchange;
			numBottles = numBottles / numExchange + numBottles % numExchange;
		}

		return totalBottles;
	}

	public static void main(String[] args) {
		System.out.println(numWaterBottles(15, 4));

	}

}
