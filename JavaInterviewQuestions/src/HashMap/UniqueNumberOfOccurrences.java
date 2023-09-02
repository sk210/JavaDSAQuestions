package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {

	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> e: map.entrySet()){
			if(set.contains(e.getValue())) {
				return false;
			}
			else {
				set.add(e.getValue());
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(arr));

	}

}
