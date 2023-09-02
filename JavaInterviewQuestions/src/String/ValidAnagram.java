package String;

public class ValidAnagram {
	
	public static boolean isAnagram(String s,String t) {
		int[] arr = new int[26];
		for(int i = 0;i<s.length();i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for(int i = 0;i<t.length();i++) {
			arr[t.charAt(i) - 'a']--;
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));

	}

}
