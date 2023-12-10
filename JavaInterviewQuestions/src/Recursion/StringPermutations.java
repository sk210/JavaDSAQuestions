package Recursion;

public class StringPermutations {
	
	public static void permutations(String str,String permutaion) {
		
		if(str.length() == 0) {
			System.out.println(permutaion);
			return;
		}
		
		for(int i = 0;i<str.length();i++) { 
			permutations((str.substring(0,i) + str.substring(i+1)),permutaion + str.charAt(i));
		}
	} 

	public static void main(String[] args) {
		permutations("abc", "");

	}

}
