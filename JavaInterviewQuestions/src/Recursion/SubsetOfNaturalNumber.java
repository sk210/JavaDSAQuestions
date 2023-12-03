package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SubsetOfNaturalNumber {
	
	public static void printSubSet(ArrayList<Integer> subSet) {
		for(int i = 0;i<subSet.size();i++) {
			System.out.print(subSet.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void subsetOfNaturalNumber(int n,ArrayList<Integer> subSet) {
		
		if(n == 0) {
			printSubSet(subSet);
			return;
		}
		
		subSet.add(n);
		subsetOfNaturalNumber(n-1, subSet);
		
		subSet.remove(subSet.size() -1);
		subsetOfNaturalNumber(n-1, subSet);
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> subSet = new ArrayList<Integer>();
		subsetOfNaturalNumber(3, subSet);

	}

}
