package Array;

public class CountNumberofTeams {

	public static int numTeams(int[] rating) {
		int total = 0;
		int n = rating.length;

		for (int i = 0; i < n; i++) {
			int rightMore = 0, rightLess = 0, leftMore = 0, leftLess = 0;

			for (int j = i + 1; j < rating.length; j++) {
				if (rating[j] < rating[i])
					rightLess++;
				else if (rating[i] < rating[j])
					rightMore++;
			}

			for (int j = 0; j < i; j++) {
				if (rating[j] < rating[i])
					leftLess++;
				else if (rating[i] < rating[j])
					leftMore++;
			}

			total += rightMore * leftLess + rightLess * leftMore;
		}

		return total;
	}

	public static void main(String[] args) {
		int[] rating = { 2, 5, 3, 4, 1 };
		System.out.println(numTeams(rating));
	}

}
