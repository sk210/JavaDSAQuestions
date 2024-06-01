package String;

public class ScoreofaString {

	public static int scoreOfString(String s) {
		char[] arr = s.toCharArray();
		int score = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			score += Math.abs(arr[i] - arr[i + 1]);
		}

		return score;
	}

	public static void main(String[] args) {
		System.out.println(scoreOfString("hello"));

	}

}
