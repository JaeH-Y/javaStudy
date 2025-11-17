package homework.loop;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		System.out.println("게임을 실행합니다!");
		Scanner sc = new Scanner(System.in);

		int inputVal;
		int sum=0;
		while(true) {
			System.out.print("숫자(0을 입력하면 종료) : ");
			if(sc.hasNextInt()) {
				inputVal = sc.nextInt();
				if(inputVal < 0) {
					continue;
				}
				else if(inputVal == 0) {
					System.out.println("양수의 합계: "+sum);
					break;
				}
				else sum += inputVal;
			}
			else {
				System.out.println("숫자를 입력하세요!");
				sc.next();
			}
		}
		
	}

}
