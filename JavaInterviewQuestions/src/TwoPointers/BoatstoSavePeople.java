package TwoPointers;

import java.util.Arrays;

public class BoatstoSavePeople {

	public static int numRescueBoats(int[] people, int limit) {
		int i = 0;
		int j = people.length - 1;
		int requiredBoat = 0;
		Arrays.sort(people);
		
		while(i <= j) {
			if(people[i] + people[j] <= limit) {
				i++;
			}
			
			j--;
			requiredBoat++;
		}
		
		return requiredBoat;
	}

	public static void main(String[] args) {
		int[] people = {1,2};
		System.out.println(numRescueBoats(people, 3));
	}

}
