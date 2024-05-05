package String;

public class CompareVersionNumbers {

	public static int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");

		int maxLength = Math.max(v1.length, v2.length);

		for (int i = 0; i < maxLength; i++) {
			int val1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
			int val2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

			if (val1 > val2)
				return 1;
			if (val2 > val1)
				return -1;
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(compareVersion("1.01", "1.001"));
	}

}
