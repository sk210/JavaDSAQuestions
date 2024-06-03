package String;

public class AppendCharacterstoStringtoMakeSubsequence {

	public static int appendCharacters(String s, String t) {
		int sIndex = 0;
		int tIndex = 0;
		int sLength = s.length();
		int tLength = t.length();

		while (sIndex < sLength && tIndex < t.length()) {
			if (s.charAt(sIndex) == t.charAt(tIndex)) {
				tIndex++;
			}

			sIndex++;
		}

		return tLength - tIndex;
	}

	public static void main(String[] args) {
		System.out.println(appendCharacters("coaching", "coding"));

	}

}
