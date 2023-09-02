package Array;

public class RemoveOddNumberInArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
        int evenCount = 0;

        // Count the number of even elements in the array
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int index = 0;
        // Overwrite odd elements with even elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[index] = array[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        for (int i = evenCount; i < array.length; i++) {
            array[i] = 0;
        }

        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

}
