package BasicQuestions;

public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {

	public static int numSteps(String s) {
		int carry = 0;
		int step = 0;
		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) - '0' + carry == 1) {
				carry = 1;
				step += 2;
			} else {
				step++;
			}
		}

		return step + carry;
	}

	public static void main(String[] args) {
		System.out.println(numSteps("1101"));

	}

}
