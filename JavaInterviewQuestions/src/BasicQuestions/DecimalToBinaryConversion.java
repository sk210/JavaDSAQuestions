package BasicQuestions;

public class DecimalToBinaryConversion {
	
	public static int DecimalToBinary(int num) {
		int i = 1;
		int binaryNumber = 0;
		while(num > 0) {
			int reminder = num%2;
			num = num/2;
			binaryNumber += reminder*i;
			i*=10;
		}
		return binaryNumber;
	}

	public static void main(String[] args) {
		System.out.println(DecimalToBinary(156));
	}

}
