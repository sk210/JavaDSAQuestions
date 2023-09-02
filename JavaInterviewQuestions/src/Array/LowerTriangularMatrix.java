package Array;

import java.util.Scanner;

public class LowerTriangularMatrix {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the row for Array : ");
		int n = userinput.nextInt();
		System.out.print("Enter the column for Array : ");
		int m = userinput.nextInt();
		System.out.print("Enter the elment for the Array : ");
		int[][] arr = new int[n][m];
		for(int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				arr[i][j] = userinput.nextInt();
			}
		}
		int j = 0;
		for(int i = 0;i<n;i++) {
			j = i+1;
			while(j<m) {
				arr[i][j] = 0;
				j++;
			}
			System.out.println();
		}
		
		System.out.println("your lower triangular matrix is : ");
		for(int i = 0;i<n;i++) {
			for(int k = 0;k<m;k++) {
				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
		
		userinput.close();

	}

}
