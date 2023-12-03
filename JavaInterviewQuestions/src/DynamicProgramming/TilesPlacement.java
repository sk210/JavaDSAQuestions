package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class TilesPlacement {
	
	public static int tilesPlacement(int n,int m,Map<String, Integer> dp) {
		
		if(n == m) {
			return 2;
		}
		
		if(n < m) {
			return 1;
		}
		
		String key = n + "," + m;
		if(dp.containsKey(key)) {
			return dp.get(key);
		}
		
		int verticlePlacements = tilesPlacement(n-m, m,dp);
		
		int horizontalPlacements = tilesPlacement(n-1, m,dp);
		
		int totalPlacements = verticlePlacements + horizontalPlacements;
		dp.put(key, totalPlacements);
		
		return totalPlacements;
	}

	public static void main(String[] args) {
		Map<String, Integer> dp = new HashMap<String, Integer>();
		System.out.println(tilesPlacement(4, 2,dp));

	}

}
