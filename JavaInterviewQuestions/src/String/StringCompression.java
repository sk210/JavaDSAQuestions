package String;

import java.util.Arrays;

public class StringCompression {

	public static int compress(char[] chars) {
		 if (chars.length <= 2) {
		        return chars.length;
		    }
		    
		    int index = 0; 
		    char c = chars[0]; 
		    int counter = 1; 

		    for (int i = 1; i < chars.length; i++) {
		        if (chars[i] == c) {
		            counter++;
		        } else {
		            chars[index++] = c; 
		            
		            if (counter > 1) {
		                char[] countChars = String.valueOf(counter).toCharArray();
		                for (char ch : countChars) {
		                    chars[index++] = ch; 
		                }
		            }

		            c = chars[i];
		            counter = 1;
		        }
		    }
		    
		    chars[index++] = c; 
		    
		    if (counter > 1) {
		        char[] countChars = String.valueOf(counter).toCharArray();
		        for (char ch : countChars) {
		            chars[index++] = ch; 
		        }
		    }
		    
		    return index;
		
	}

	public static void main(String[] args) {
		char[] c = {'a','b','c','c','c'};
		int length = compress(c);
		char[] subArray = new char[length];
		System.arraycopy(c, 0, subArray, 0, length);
		System.out.println(Arrays.toString(subArray));

	}

}
