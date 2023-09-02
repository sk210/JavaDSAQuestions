package BinarySearch;

import java.util.Scanner;

public class Sqrt {

	public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        long mid = 0;
        while(start<=end){
            mid = start + ((end - start)/2);
            if((mid*mid) <= x && ((mid+1)*(mid+1))>x){
                return (int)mid;
            }
            if((mid*mid)>x){
                end = (int)mid - 1;
            }
            else{
                start = (int)mid + 1;
            }
        }
        return 0;
        
    }

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		int number = userinput.nextInt();
		System.out.println(mySqrt(number));

	}

}
