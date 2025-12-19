package exampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import javax.print.DocFlavor.INPUT_STREAM;

public class Sol38 {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		int answer = 0;
//		List<Integer> scoList = new ArrayList<Integer>();
		// 시간초과 부분에 대해 GPT한테 물어봄
		// PriorityQueue => 항상 최소값 OUT하는 큐
		PriorityQueue<Integer> scoQue = new PriorityQueue<Integer>();
		for(int sc:scoville) {
			scoQue.offer(sc);
		}
//		Collections.sort(scoList);
//		if(scoQue.peek() >= K) return 0;
		while(scoQue.size() > 1 && scoQue.peek() < K) {
			int small = scoQue.poll();
			int next = scoQue.poll();
			int mix = small + (next * 2);
			scoQue.offer(mix);
			answer++;
		}
//		if(scoQue.peek() < K) return -1;
		System.out.println(answer);
	}
}
