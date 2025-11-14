package homework.loop;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		
		String tree = "";
		
		for(int i = 0 ; i < 5; i++) {
			String left = "";
			String right= "";
			if(4-i > 0) {
				left = String.format("%"+(4-i)+"s", "");
				right = String.format("%"+-(4-i)+"s", "");
			}
			tree = String.format("%"+(1+(i*2))+"s", "*").replace(' ', '*');
			tree = left + tree + right;
			System.out.println(tree);
		}
		
		
		for (int i = 5; i > 0; i--) {
			String isTree = "";
			String isLeft = "";
			String isRight = "";
			
			int spacecount = i-1;
			if(spacecount != 0) {
				isLeft = String.format("%"+spacecount+"s", "");
				isRight = String.format("%"+spacecount+"s", "");
			}
			for(int j = 0; j < 11 - (i*2); j++) {
				isTree += "*";
			}
			isTree = isLeft + isTree + isRight;
			System.out.println(isTree);
		}
		
		
	}

}
