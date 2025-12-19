package baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> maxQue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int val = sc.nextInt();
			if(val == 0) {
				if(maxQue.size() == 0) {
					System.out.println("0");
					continue;
				}
				System.out.println(maxQue.poll());
			}
			else {
				maxQue.offer(val);
			}
		}
	}
}
