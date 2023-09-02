package Array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        int max = candies[0];
	        List<Boolean> list = new ArrayList<>();
	        for(int i = 1;i<candies.length;i++) {
	        	if(max < candies[i]) {
	        		max = candies[i];
	        	}
	        }
	        for(int i = 0;i<candies.length;i++) {
	        	list.add((candies[i] + extraCandies) >= max);
	        }
	        return list;
	  }

	public static void main(String[] args) {
		int[] arr1 = {2,3,5,1,3};
		System.out.println(kidsWithCandies(arr1, 3));

	}

}
