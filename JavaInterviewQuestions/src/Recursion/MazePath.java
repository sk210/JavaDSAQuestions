package Recursion;

import java.util.HashMap;
import java.util.Map;

public class MazePath {
	
	public static int mazePath(int i,int j,int m,int n,Map<String,Integer> memo) {
		if(i == m || j == n) {
			return 0;
		}
		if(i == m-1 || j == n-1) {
			return 1;
		}
		
		String key = i + "," + j;
		if(memo.containsKey(key)) {
			return memo.get(key);
		}
		
		int downPath = mazePath(i+1, j, m, n,memo);
		
		int rightPath = mazePath(i, j+1, m, n,memo);
		
		int totalPath = rightPath + downPath;
		memo.put(key, totalPath);
		
		return totalPath;
	}
	
	public static int uniquePaths(int m, int n) {
		Map<String,Integer> memo = new HashMap<>();
        return mazePath(0,0,m,n,memo);
    }

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 3));

	}

}
