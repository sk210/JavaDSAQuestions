package Stack;

import java.util.Stack;

public class CrawlerLogFolder {

	public static int minOperations(String[] logs) {
		Stack<String> stack = new Stack<String>();

		for (String log : logs) {
			if (log.equals("../")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else if (!log.equals("./")) {
				stack.push(log);
			}
		}

		return stack.size();
	}

	public static void main(String[] args) {
		String[] log = { "d1/", "d2/", "../", "d21/", "./" };
		System.out.println(minOperations(log));

	}

}
