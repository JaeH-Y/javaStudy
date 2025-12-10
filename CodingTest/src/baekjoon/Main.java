package baekjoon;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCount = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < testCount; i++) {
			int closed = start(sc.nextLine());
			if(closed == 0) System.out.println("YES");
			else System.out.println("NO");
		}
		
	}
	public static int start(String question) {
		Stack<Character> st = new Stack<Character>();
		char[] parenthesis = question.toCharArray();
		for(char c : parenthesis) {
			if(c == '(') st.push(c);
			else {
				if(st.empty()) return 1;
				else st.pop();	
			}
		}
		if(st.isEmpty()) return 0;
		else return st.size();
	}
}

