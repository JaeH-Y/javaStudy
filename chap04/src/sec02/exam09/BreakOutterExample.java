package sec02.exam09;

import java.util.Iterator;

public class BreakOutterExample {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				if(j==3) {
					break;
				}
				System.out.println("i=" + i + "j=" + j);
			}
		}
		System.out.println("프로그램 실행 종료");
		System.out.println();
		
		
		Outter : for(char upper = 'A'; upper < 'Z'; upper++) {
			
			for (char lower = 'a'; lower < 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;	// Label이 지정된 for문을 빠져나감
				}
			}
		}

		System.out.println("프로그램 실행 종료");
		System.out.println();






	}
}
