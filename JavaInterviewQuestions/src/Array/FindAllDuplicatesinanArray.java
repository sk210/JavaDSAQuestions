package Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {

	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		boolean[] boolarr = new boolean[nums.length + 1];
		
		for(int num : nums) {
			if(boolarr[num]) list.add(num);
			boolarr[num] = true;
		}
		
		return list;
	}

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(nums));

	}

}
