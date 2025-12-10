package exampleTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Sol27 {
	public static void main(String[] args) {
		int n = 2;
		
		int[][] answer = new int[3][2];
		
		Stack<Integer> firSt = new Stack<Integer>();
		Stack<Integer> secSt = new Stack<Integer>();
		Stack<Integer> thiSt = new Stack<Integer>();
		List<Integer[]> arrList = new ArrayList<Integer[]>();
		for(int i = n; i >= 0; i--) {
			firSt.push(i);
		}
		System.out.println(firSt);
		// 조건 1: 직전 목적지는 지금 움직이면 안됨
		// 조건 2: 나머지 2개 요소 중 작은 애가 움직임
		// 조건 3: 움직이기로 한 요소 제외 2개 요소 중 작은 곳으로 움직임
		// 조건 4: 
		
		while (true) {
			if(secSt.isEmpty()) {
				int poped = firSt.pop();
				secSt.push(poped);
				Integer[] move1to2 = {1,2};
				arrList.add(move1to2);
			}
			if(thiSt.isEmpty()) {
				int poped = firSt.pop();
				thiSt.push(poped);
				Integer[] move1to3 = {1,3};
				arrList.add(move1to3);	
			}
			if(!secSt.isEmpty() && !thiSt.isEmpty()) {
				int minV = Math.min(secSt.lastElement(), thiSt.lastElement());
				
				if(minV == secSt.lastElement()) {
					int poped = secSt.pop();
					Integer[] arr = {2,3};
					arrList.add(arr);
				}
				else {
					Integer[] arr = {3,2};
					arrList.add(arr);
				}
			}
		}
		
		
		
		
		
		
	}
}
