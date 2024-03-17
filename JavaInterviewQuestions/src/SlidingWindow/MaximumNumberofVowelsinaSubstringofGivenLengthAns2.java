package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberofVowelsinaSubstringofGivenLengthAns2 {
	
	public static boolean isVowel(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':{
                return true;
            }
        }
        return false;
    }

	public static int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
		int i = 0;
		int j = 0;
		int count = 0;
		int max = 0;
		
		while(j < s.length()) {
			if(isVowel(arr[j])) {
				count++;
			}
			if(j - i + 1 == k) {
				max = Math.max(max, count);
				if(max == k) {
					return max;
				}
				if(isVowel(arr[i])) {
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
