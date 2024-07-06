package BasicQuestions;

public class PassthePillow {

	public static int passThePillow(int n, int time) {
		int chunks = time / (n - 1);
		return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
	}

	public static void main(String[] args) {
		System.out.println(passThePillow(4, 5));

	}

}
