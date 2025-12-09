package exampleTest;

import java.util.LinkedList;
import java.util.Queue;

public class Sol22 {
	public static void main(String[] args) {
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		
		int answer = 0;
		int[] scores = new int[10];
		int max = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int property : priorities) {
			max = Math.max(property, max);
			queue.offer(property);
			scores[property]++;
		}
		System.out.println(queue);
		while(true) {
			int nowValue = queue.poll();
			if(nowValue != max) {
				queue.offer(nowValue);
			}
			else {
				scores[nowValue]--;
				answer++;
				if(location == 0) {
					System.out.println(answer + "번 째 추출");
					break;
				}
				for(int i = max; i >= 0; i--) {
					if(scores[i] > 0) {
						max = i;
						break;
					}
				}
			}
			location--;
			if(location < 0) {
				location = queue.size()-1;
			}
		}
		System.out.println(answer);
	}
}
