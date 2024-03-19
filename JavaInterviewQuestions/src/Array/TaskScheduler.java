package Array;

import java.util.Arrays;

public class TaskScheduler {

	public static int leastInterval(char[] tasks, int n) {
		int[] freq = new int[26];
		
		for(int i = 0;i<tasks.length;i++) {
			freq[tasks[i] - 'A']++;
		}
		
		Arrays.sort(freq);
		int lastValue = freq[25];
		int chunk = lastValue - 1;
		int idel = chunk * n;
		
		for(int i = 24;i >= 0;i--) {
			if(freq[i] == lastValue) {
				idel -= chunk;
			}
			else {
				idel -= freq[i];
			}
			
			if(freq[i] == 0) break;
		}
		
		return idel < 0 ? tasks.length : tasks.length + idel;
	}

	public static void main(String[] args) {
		char[] tasks = {'A','A','A','B','B','B'};
		System.out.println(leastInterval(tasks, 2));
	}

}
