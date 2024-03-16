package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberofVowelsinaSubstringofGivenLength {

	public static int maxVowels(String s, int k) {
		char[] charArray = s.toCharArray();
		int i = 0;
		int j = 0;
		int count = 0;
		int max = 0;
		Set<Character> set = new HashSet<Character>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		while(j < charArray.length) {
			if(set.contains(charArray[j])) {
				count++;
			}
			if(j - i + 1 == k) {
				max = Math.max(max, count);
				if(max == k) {
					return max;
				}
				if(set.contains(charArray[i])) {
					count--;
				}
				i++;
			}
			j++;
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxVowels("abciiidef", 3));
	}

}
