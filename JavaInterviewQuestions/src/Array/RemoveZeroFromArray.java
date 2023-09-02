package Array;

public class RemoveZeroFromArray {

	public static void main(String[] args) {
		int[] array = {1, 0, 2, 0, 3, 4, 0, 5};

        int nonZeroCount = 0;

        // Count the number of non-zero elements
        for (int num : array) {
            if (num != 0) {
                nonZeroCount++;
            }
        }

        int index = 0;

        // Overwrite zero elements with non-zero elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        for (int i = nonZeroCount; i < array.length; i++) {
            array[i] = 0;
        }

        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

}
