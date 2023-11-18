package Recursion;

public class RemoveDuplicatesFromString {
	
	public static String removeDuplicate(String str,int index,String newString,boolean[] map) {
		if(index == str.length()) {
			return newString;
		}
		
		if(map[str.charAt(index) - 'a']) {
			return removeDuplicate(str, index+1, newString, map);
		}
		else {
			newString += str.charAt(index);
			map[str.charAt(index) - 'a'] = true;
			return removeDuplicate(str, index+1, newString, map);
		}
	}

	public static void main(String[] args) {
		String str = "abbccda";
		boolean[] map = new boolean[26];
		System.out.println(removeDuplicate(str, 0, "", map));

	}

}
