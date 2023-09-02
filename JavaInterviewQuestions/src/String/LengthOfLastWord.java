package String;

import java.util.Arrays;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		String[] words = s.trim().split("\\s+");
		return words[words.length - 1].length();
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon     "));
	}

}
