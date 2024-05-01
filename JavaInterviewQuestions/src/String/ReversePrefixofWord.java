package String;

public class ReversePrefixofWord {

	public static String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);

		if (index == -1)
			return word;
		return new StringBuilder(word.substring(0, index + 1)).reverse().toString() + word.substring(index + 1);
	}

	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefd", 'd'));
	}

}
