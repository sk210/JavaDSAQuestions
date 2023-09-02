package HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class duplicateInString {
	
	public static HashSet<Character> duplicateFindByHashSet(String str) {
		HashSet<Character> stringDuplicateValue = new HashSet<>();
		HashSet<Character> stringCharcter = new HashSet<>();
		for(char chr : str.toCharArray()) {
			if(stringDuplicateValue.contains(chr)) {
				stringCharcter.add(chr);
			}
			stringDuplicateValue.add(chr);
		}
		return stringCharcter;
	}

	public static void main(String[] args) {
		HashSet<Character> checkingDuplicate = duplicateFindByHashSet("kaushal");
		Iterator<Character> itr = checkingDuplicate.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
