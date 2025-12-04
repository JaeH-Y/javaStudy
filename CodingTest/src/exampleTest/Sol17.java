package exampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Sol17 {
	public static void main(String[] args) {
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		List<Integer> list = new ArrayList<Integer>();
		int len = progresses.length;
		Stack<Integer> progressStack = new Stack<Integer>();
		for(int i = len -1; i >= 0; i--) {
			progressStack.push(progresses[i]);
		}
		
		while(!progressStack.isEmpty()) {
			int popCount = 0;
			int size = progressStack.size();
			int popped = len - size;
			System.out.println("popped: " + popped);
			for(int i = popped; i < len; i++) {
				progressStack.set(len-1-i, progressStack.elementAt(len-1-i) + speeds[i]);
			}
			System.out.println(progressStack);
			while(progressStack.lastElement() >= 100) {
				popCount++;
				progressStack.pop();
				if(progressStack.isEmpty()) break;
				System.out.println("통과");
				System.out.println(progressStack.size());
			}
			if(popCount > 0)
				list.add(popCount);
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		String str = "123214";
		System.out.println(answer);
	}
}
