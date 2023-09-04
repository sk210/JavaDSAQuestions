package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {

	public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < asteroids.length; i++) {
			boolean collision = true;
			while(!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0) {
				if(stack.peek() < -asteroids[i]) {
					stack.pop();
					continue;
				}
				else if(stack.peek() > -asteroids[i]) {
					collision = false;
					break;
				}
				else {
					stack.pop();
					collision = false;
					break;
				}
			}
			if(collision) {
				stack.push(asteroids[i]);
			}
		}
		int[] intArray = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; i--) {
			intArray[i] = stack.pop();
		}
		return intArray;
	}

	public static void main(String[] args) {
		int[] asteroids = {8,-8};
		System.out.println(Arrays.toString(asteroidCollision(asteroids)));

	}

}
