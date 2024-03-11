package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {

	public static String customSortString(String order, String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder strBuilder = new StringBuilder();
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(char c: order.toCharArray()) {
			if(map.containsKey(c)) {
				strBuilder.append(String.valueOf(c).repeat(map.get(c)));
				map.remove(c);
			}
		}
		
		for(char c: map.keySet()) {
			strBuilder.append(String.valueOf(c).repeat(map.get(c)));
		}
		
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(customSortString("cba", "abcd"));
	}

}
