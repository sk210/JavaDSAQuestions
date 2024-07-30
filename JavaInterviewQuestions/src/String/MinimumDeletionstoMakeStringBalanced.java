package String;

public class MinimumDeletionstoMakeStringBalanced {

	public static int minimumDeletions(String s) {
		int n = s.length();
		int[] res = new int[n + 1];
		int b = 0;

		for (int i = 1; i <= n; i++) {
			if (s.charAt(i - 1) == 'b') {
				res[i] = res[i - 1];
				b++;
			} else {
				res[i] = Math.min(res[i - 1] + 1, b);
			}
		}

		return res[n];
	}

	public static void main(String[] args) {
		System.out.println(minimumDeletions("aababbab"));

	}

}
