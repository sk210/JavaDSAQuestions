package String;

public class RemoveKDigits {

	public static String removeKdigits(String num, int k) {
		char[] charDigitsArr = num.toCharArray();
		if (k == charDigitsArr.length)
			return "0";
		char[] stack = new char[charDigitsArr.length];
		int stackTop = -1;
		int removelCount = k;

		for (int i = 0; i < charDigitsArr.length; i++) {
			while (removelCount > 0 && stackTop >= 0 && stack[stackTop] > charDigitsArr[i]) {
				stackTop--;
				removelCount--;
			}
			stackTop++;
			stack[stackTop] = charDigitsArr[i];
		}

		int nonZeroRemovelCount = 0;

		while (stack[nonZeroRemovelCount] == '0' && nonZeroRemovelCount < charDigitsArr.length - k - 1) {
			nonZeroRemovelCount++;
		}

		return String.valueOf(stack, nonZeroRemovelCount, charDigitsArr.length - k - nonZeroRemovelCount);
	}

	public static void main(String[] args) {
		System.out.println(removeKdigits("1432219", 3));

	}

}
