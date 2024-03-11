package String;

public class CustomSortString {

	public static String customSortString(String order, String s) {
		int[] count = new int[26];
		StringBuilder strBuilder = new StringBuilder();
		for(char c: s.toCharArray()) {
			count[c - 'a']++;
		}
		
		for(char c: order.toCharArray()) {
			strBuilder.append(String.valueOf(c).repeat(count[c - 'a']));
			count[c - 'a'] = 0;
		}
		
		for(int i = 0;i < 26;i++) {
			strBuilder.append(String.valueOf((char)(i + 'a')).repeat(count[i]));
		}
		
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(customSortString("cba", "abcd"));
	}

}
