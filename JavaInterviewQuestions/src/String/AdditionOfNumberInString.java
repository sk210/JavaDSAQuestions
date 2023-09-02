package String;

public class AdditionOfNumberInString {
	
	public static int additionOfNumberInString(String s) {
		int sum = 0;
		String temp = "";
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				temp +=  s.charAt(i);
			}
			else {
				if(temp != "") {
				sum += Integer.valueOf(temp);
				temp = "";
				}
			}
		}
		if(temp != "") {
			sum += Integer.valueOf(temp);
		}
		return sum;
	}
	

	public static void main(String[] args) {
		System.out.println(additionOfNumberInString("128ghij9dg56dh637373"));
	}

}
