package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class FreedomTrail {

	public static int helper(int index, int pos, List<Integer>[] positions, char[] ring, char[] key, int[][] dp) {
		if(index == key.length) return 0;
		
		if(dp[index][pos] != 0) return dp[index][pos];
		
		List<Integer> possiblePostion = positions[key[index] - 'a'];
		
		int minValue = Integer.MAX_VALUE;
		
		for(int nextPos : possiblePostion) {
			int steps = Math.min(Math.abs(nextPos - pos), ring.length - Math.abs(nextPos - pos));
			
			int totalSteps = steps + helper(index + 1, nextPos, positions, ring, key, dp); 
			
			minValue = Math.min(totalSteps, minValue);
		}
		
		return dp[index][pos] = minValue + 1;
	}

	public static int findRotateSteps(String ring, String key) {
		char[] r = ring.toCharArray();
		List<Integer>[] positions = new List[26];
		
		for(int i = 0;i < r.length; i++) {
			int charIndex = r[i] - 'a';
			if(positions[charIndex] == null) positions[charIndex] = new ArrayList<Integer>();
			positions[charIndex].add(i);
		}
		
		int[][] dp = new int[key.length()][ring.length()];
		return helper(0, 0, positions, r, key.toCharArray(), dp);
	}

	public static void main(String[] args) {
		System.out.println(findRotateSteps("godding", "gd"));

	}

}
