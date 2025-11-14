package homework.loop;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputVal;
		while(true) {
			System.out.print("숫자: ");
			if(sc.hasNextInt()) {
				inputVal = sc.nextInt();
				if(inputVal <= 9 && inputVal >= 1) {
					for(int i = inputVal; i < 10; i++) {
						System.out.println("=== "+i+"단 ===");
						for (int j = 1; j < 10; j++) {
							System.out.println(i+"*"+j+"="+(i*j));
						}
					}
				}
				else if(inputVal == 0) {
					System.out.println("프로그램을 종료합니다.");
					return;
				}
				else if(inputVal < 0) {
					System.out.println("1이상의 양수만 입력해주세요.");
				}
				else
				System.out.println("9이하의 정수를 입력하세요.");
			}
			else {
				System.out.println("숫자를 입력하세요!");
				sc.next();
			}
		}
		
	}

}
