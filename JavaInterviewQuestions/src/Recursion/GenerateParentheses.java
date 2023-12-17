package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	public static void helper(List<String> parenthesisList,int n,String parenthesis,int open,int close) {
		
		if(parenthesis.length() == n*2) {
			parenthesisList.add(parenthesis);
			return;
		}
		
		if(open < n) {
			helper(parenthesisList, n, parenthesis + '(', open + 1, close);
		}
		
		if(close < open) {
			helper(parenthesisList, n, parenthesis + ')', open, close + 1);
		}
		
	}

	public static List<String> generateParenthesis(int n) {
		List<String> parenthesisList = new ArrayList<String>();
		helper(parenthesisList, n, "", 0,0);
		return parenthesisList;
		
	}

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));

	}

}
