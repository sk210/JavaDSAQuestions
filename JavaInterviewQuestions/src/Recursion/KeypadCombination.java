package Recursion;

public class KeypadCombination {
	
	public static void keypadCombination(String str,int index,String combination,String[] arr) {
		if(index == str.length()) {
			System.out.println(combination);
			return;
		}
		String keypadKey = arr[str.charAt(index) - '0'];
		for(int i = 0;i<keypadKey.length();i++) {
			keypadCombination(str, index+1, combination + keypadKey.charAt(i), arr);
		}
	}

	public static void main(String[] args) {
		String[] arr = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		String str = "23";
		keypadCombination(str, 0, "", arr);
	}

}
