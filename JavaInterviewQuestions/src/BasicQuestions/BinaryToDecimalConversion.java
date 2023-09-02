package BasicQuestions;

public class BinaryToDecimalConversion {
	
	public static int BinaryToDecimal(int num) {
		int decimal = 0;
		int i = 0;
		while(num != 0) {
			int reminder = num%10;
			num = num/10;
			decimal += reminder*Math.pow(2, i);
			++i;
		}
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println(BinaryToDecimal(10011011));

	}

}
