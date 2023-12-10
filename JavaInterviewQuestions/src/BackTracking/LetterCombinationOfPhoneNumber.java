package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
	
	public static void keypadCombination(String digits,int index,String[] arr,String combination,List<String> combinationList) {
		if(index == digits.length()) {
			combinationList.add(combination);
			return;
		}
		String keyPadButton = arr[digits.charAt(index) - '1'];
		
		for(int i = 0;i<keyPadButton.length();i++) {
			keypadCombination(digits, index + 1, arr, combination + keyPadButton.charAt(i),combinationList);
		}
	}

	public static List<String> letterCombinations(String digits) {
		List<String> combinationList = new ArrayList<String>();
		if(digits.isEmpty()) {
			return combinationList;
		}
		String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		keypadCombination(digits, 0, arr, "", combinationList);
		return combinationList;
	}

	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}

}
