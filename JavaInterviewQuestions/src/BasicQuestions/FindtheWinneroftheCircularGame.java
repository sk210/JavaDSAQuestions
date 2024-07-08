package BasicQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindtheWinneroftheCircularGame {

	public static int findTheWinner(int n, int k) {
		List<Integer> circle = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			circle.add(i);
		}

		int currInd = 0;
		while (circle.size() > 1) {
			int nextRemove = (currInd + (k - 1)) % circle.size();
			circle.remove(nextRemove);
			currInd = nextRemove;
		}

		return circle.get(0);
	}

	public static void main(String[] args) {
		System.out.println(findTheWinner(5, 2));

	}

}
