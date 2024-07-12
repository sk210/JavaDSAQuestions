package Stack;

public class MaximumScoreFromRemovingSubstrings {

	public static int maximumGain(String s, int x, int y) {
		int res = 0;
		String top, bot;
		int topScore, botScore;

		if (y > x) {
			top = "ba";
			topScore = y;
			bot = "ab";
			botScore = x;
		} else {
			top = "ab";
			topScore = x;
			bot = "ba";
			botScore = y;
		}

		StringBuilder stack = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch == top.charAt(1) && stack.length() > 0 && stack.charAt(stack.length() - 1) == top.charAt(0)) {
				res += topScore;
				stack.setLength(stack.length() - 1);
			} else {
				stack.append(ch);
			}
		}

		StringBuilder newStack = new StringBuilder();
		for (char ch : stack.toString().toCharArray()) {
			if (ch == bot.charAt(1) && newStack.length() > 0
					&& newStack.charAt(newStack.length() - 1) == bot.charAt(0)) {
				res += botScore;
				newStack.setLength(newStack.length() - 1);
			} else {
				newStack.append(ch);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		System.out.println(maximumGain("cdbcbbaaabab", 4, 5));
	}
}
