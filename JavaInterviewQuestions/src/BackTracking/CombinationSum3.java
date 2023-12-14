package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
	
	public static void helper(List<List<Integer>> combinationList,List<Integer> combination,int k,int n,int index,int sum) {
		if(sum == n && combination.size() == k) {
			combinationList.add(new ArrayList<Integer>(combination));
			return;
		}
		
		if(combination.size() == k) {
			return;
		}
			
		for(int i =index;i<=9;i++) {
			combination.add(i);
			helper(combinationList, combination, k, n, i+1,sum + i);
			combination.remove(combination.size() - 1);
		}
	}

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> combinationList = new ArrayList<>();
		List<Integer> combination = new ArrayList<Integer>();
		helper(combinationList,combination,k,n,1,0);
		return combinationList;
	}

	public static void main(String[] args) {
		System.out.println(combinationSum3(3, 9));
	}

}
