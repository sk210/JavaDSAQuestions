package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	
	public static void helper(List<List<Integer>> combineLIst,List<Integer> list,int n,int k,int index) {
		if(list.size() == k) {
			combineLIst.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i = index;i<=n;i++) {
			list.add(i);
			helper(combineLIst, list, n, k, i+1);
			list.remove(list.size() - 1);
		}
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combineLIst = new ArrayList<List<Integer>>();
		helper(combineLIst, new ArrayList<Integer>(),n,k,1);
		return combineLIst;
	}

	public static void main(String[] args) {
		System.out.println(combine(4, 2));
	}

}
