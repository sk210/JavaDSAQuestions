package HashMap;

import java.util.HashMap;

public class FirstUniqueCharacter {
	
	 public static int firstUniqChar(String s) {
	        HashMap<Character, Integer> map = new HashMap<>();
	        for(int i = 0;i<s.length();i++) {
	        	if(map.containsKey(s.charAt(i))) {
	        	map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
	        	}
	        	else {
	        		map.put(s.charAt(i), 1);
	        	}
	        }
	        
	        for(int i = 0;i<s.length();i++) {
	        	if(map.get(s.charAt(i)) <= 1) {
	        		return i;
	        	}
	        }
	        
	        return -1;
	 }
	 
	 public static int firstUniqChar2(String s) {
	        int ans = Integer.MAX_VALUE;
	        for(char c='a'; c<='z';c++){
	            int index = s.indexOf(c);
	            if(index!=-1&&index==s.lastIndexOf(c)){
	                ans = Math.min(ans,index);
	            }
	        }
	        return ans==Integer.MAX_VALUE?-1:ans;
	    }

	public static void main(String[] args) {
		System.out.println(firstUniqChar2("loveleetcode"));

	}

}
