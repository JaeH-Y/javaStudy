package homework.loop;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수: ");
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				
				if(num < 1) {
					System.out.println("양수가 아닙니다.");
					continue;
				}
				String printM = "";
				for(int i = 1; printM.length() < num; i++) {
					printM += i % 2 == 1 ? "박" : "수";
				}
				System.out.println(printM);
				break;
			}
			else {
				System.out.println("숫자를 입력하세요!");
				sc.next();
			}
		}
		System.out.println("끝");
		
	}

}
