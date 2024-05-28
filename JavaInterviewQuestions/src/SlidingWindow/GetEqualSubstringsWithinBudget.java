package SlidingWindow;

public class GetEqualSubstringsWithinBudget {

	public static int equalSubstring(String s, String t, int maxCost) {
		int i = 0;
		int length = s.length();		
		int[] abs = new int[length];
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		int tempAns = 0;
		
		for(int j = 0; j < length; j++) {
			abs[j] = Math.abs(s.charAt(j) - t.charAt(j));
			sum += abs[j];
			tempAns++;
			while(sum > maxCost) {
				sum -= abs[i];
				tempAns--;
				i++;
			}
			ans = Math.max(ans, tempAns);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(equalSubstring("abcd", "bcdf", 3));
	}

}
