package Array;

public class NumberofStudentsUnabletoEatLunch {

	public static int countStudents(int[] students, int[] sandwiches) {
		int[] arr = new int[2];
		for (int student : students)
			arr[student]++;

		int remaining = sandwiches.length;
		for (int sandwich : sandwiches) {
			if (arr[sandwich] == 0)
				break;
			remaining--;
			arr[sandwich]--;
		}

		return remaining;
	}

	public static void main(String[] args) {
		int[] students = { 1, 1, 0, 0 };
		int[] sandwiches = { 0, 1, 0, 1 };

		System.out.println(countStudents(students, sandwiches));
	}

}
