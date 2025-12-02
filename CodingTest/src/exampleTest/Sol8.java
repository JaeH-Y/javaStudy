package exampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Sol8 {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		int test = stack.pop();
		String answer = "";
		String s = "  for the what  1what  ";
		StringBuffer buff = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++) {
			if(i == 0) {
				buff.append(s.charAt(i) + "");
				continue;
			}
//			System.out.println(" ".equals(s.charAt(i) + ""));
			if((s.charAt(i) + "").equals(" ")) buff.append(" ");
			else if((s.charAt(i - 1)+"").equals(" ") && !((s.charAt(i)+"").equals(" "))) {
				String up = (s.charAt(i)+"").toUpperCase();
				System.out.println(up);
				buff.append(up);
			}
			else if(!(s.charAt(i - 1)+"").equals(" ") && !((s.charAt(i)+"").equals(" "))) {
				String low = (s.charAt(i) + "").toLowerCase();
				buff.append(low);
			}
		}
		answer = buff.toString();
 		System.out.println(answer);
//		for(String s : arrs) {
//			char c = s.charAt(0);
//			s = s.toLowerCase();
//			String up = (c + "").toUpperCase();
//			StringBuffer buffer = new StringBuffer().append(up);
//			for(int i = 1; i < s.length(); i++) {
//				buffer.append(s.charAt(i) + "");
//			}
//			str += buffer;
//		}
	}
}
