package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MaximumIndexSumOfTwoList {
	
	 public static String[] findRestaurant(String[] list1, String[] list2) {
	        HashMap<String, Integer> map = new HashMap<>();
	        ArrayList<String> arrayList = new ArrayList<>();
	        for(int i = 0;i<list1.length;i++) {
	        	if(map.containsKey(list1[i])) {
	        		map.put(list1[i], map.get(list1[i]) + 1);
	        	}
	        	else {
	        		map.put(list1[i],1);
	        	}
	        }
	        for(int j = 0;j<list2.length;j++) {
	        	if(map.containsKey(list2[j])) {
	        		arrayList.add(list2[j]);
	        	}
	        }
	        String[] str = new String[arrayList.size()];
	        
	        for (int i = 0; i < arrayList.size(); i++) {
	            str[i] = arrayList.get(i);
	        }
	        return str;
	  }

	public static void main(String[] args) {
		String[] arr1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] arr2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		System.out.println(Arrays.toString(findRestaurant(arr1, arr2)));

	}

}
