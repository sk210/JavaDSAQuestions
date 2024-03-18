package Array;

import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

	public static int findMinArrowShots(int[][] points) {
		Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
		int arrow = 1;
		int prevArrowMax = points[0][1];
		
		for(int i = 1;i < points.length; i++) {
			if(prevArrowMax < points[i][0]) {
				arrow++;
				prevArrowMax = points[i][1];
			}
		}
		
		return arrow;
	}

	public static void main(String[] args) {
		int[][] points = {{10,16},{2,8},{1,6},{7,12}};
		System.out.println(findMinArrowShots(points));
	}

}
