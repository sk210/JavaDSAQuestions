package String;

public class StudentAttendanceRecord {

	public static boolean checkRecord(String s) {
		int abs = 0;
		int length = s.length();

		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (c == 'A')
				abs++;
			if (c == 'L' && i < length - 2 && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
				return false;
		}

		if (abs > 1)
			return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP"));

	}

}
