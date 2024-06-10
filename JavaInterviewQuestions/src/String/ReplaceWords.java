package String;

import java.util.Arrays;
import java.util.List;

public class ReplaceWords {

	public static String replaceWords(List<String> dictionary, String sentence) {
		String[] strArr = sentence.split(" ");
		int length = strArr.length;
		sentence = "";
		for (int i = 0; i < length; i++) {
			for (String dict : dictionary) {
				if (strArr[i].length() >= dict.length() && strArr[i].substring(0, dict.length()).equals(dict))
					strArr[i] = dict;
			}
		}

		for (int i = 0; i < length - 1; i++) {
			sentence += strArr[i] + " ";
		}

		sentence += strArr[length - 1];

		return sentence;
	}

	public static void main(String[] args) {
		String[] str = { "cat", "bat", "rat" };
		System.out.println(replaceWords(Arrays.asList(str), "the cattle was rattled by the battery"));

	}

}
