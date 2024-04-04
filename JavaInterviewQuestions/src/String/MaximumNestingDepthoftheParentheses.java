package String;

public class MaximumNestingDepthoftheParentheses {

	public static int maxDepth(String s) {
		int count = 0;
		int ans = 0;

		for (char c : s.toCharArray()) {
			if (c == '(') {
				count++;
				if (count > ans) {
					ans = count;
				}
			} else if (c == ')') {
				count--;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));

	}

}
