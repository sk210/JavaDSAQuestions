package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		StringBuilder str = new StringBuilder();
		char[] sortedP = p.toCharArray();
		Arrays.sort(sortedP);
		int i = 0;
		int j = 0;
		while(j < s.length()) {
			str.append(s.charAt(j));
			if(j - i + 1 == p.length()) {
				char[] arr1 = str.toString().toCharArray();
				Arrays.sort(arr1);
				if(Arrays.equals(arr1, sortedP)) {
					list.add(i);
				}
				str.deleteCharAt(0);
				i++;
			}
			j++;
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		System.out.println(findAnagrams("cbaebabacd", "abc"));
	}

}
