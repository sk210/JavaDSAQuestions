package String;

import java.util.HashMap;
import java.util.HashSet;

public class ReverseVowelOfString {

	public static String reverseVowels(String s) {
		HashSet<Character> charSet = new HashSet<>();
		charSet.add('a');
		charSet.add('e');
		charSet.add('i');
		charSet.add('o');
		charSet.add('u');
		charSet.add('A');
		charSet.add('E');
		charSet.add('I');
		charSet.add('O');
		charSet.add('U');
		int i = 0;
		int j = s.length() - 1;
		char[] charArray = s.toCharArray();
		while(i<j) {
			if(charSet.contains(charArray[i]) && charSet.contains(charArray[j])) {
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
				i++;
				j--;
			}
			else {
				if(!charSet.contains(charArray[i])) {
					i++;
				}
				if(!charSet.contains(charArray[j])) {
					j--;
				}
			}
		}
		return String.valueOf(charArray);

	}

	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}

}
