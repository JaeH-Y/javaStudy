package exampleTest;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sol37 {
	public static void main(String[] args) {
		int[] queue1 = {1, 1};
		int[] queue2 = {1, 5};
		
		int answer = 0;
		
		Queue<Integer> que1 = new ArrayDeque<Integer>();
		Queue<Integer> que2 = new ArrayDeque<Integer>();
		
		long sum1 = 0;
		long sum2 = 0;
		int maxVal = 0;
        
		for(int off : queue1) {
			que1.offer(off);
			sum1 += off;
            maxVal = Math.max(off, maxVal);
		}
		for(int off : queue2) {
			que2.offer(off);
			sum2 += off;
            maxVal = Math.max(off, maxVal);
		}
		
        if((sum1 + sum2) % 2 == 1) {
        	System.out.println("-1");
        	return;
        }
//        if((sum1 + sum2) % 2 == 1) return -1;
        
		long average = (sum1 + sum2) / 2;
        if(maxVal > average) {
        	System.out.println("-1");
        	return;
        }
//        if(maxVal > average) return -1;
		
        int limit = 3 * (que1.size() + que2.size());
        
		while(sum1 != average && answer <= limit) {
			
			if(sum1 > average) {
				int num = que1.poll();
				que2.offer(num);
				sum1 -= num;
				sum2 += num;
			}
			else {
				int num = que2.poll();
				que1.offer(num);
				sum2 -= num;
				sum1 += num;
			}
			answer++;
		}
		
		System.out.println(answer);
	}
}
