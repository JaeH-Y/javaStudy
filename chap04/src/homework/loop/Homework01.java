package homework.loop;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputVal;
		while(true) {
			if(sc.hasNextInt()) {
				inputVal = sc.nextInt();
				if(inputVal <= 50 && inputVal >= 1) {
					break;
				}
				System.out.println("1~50 사이의 정수를 입력하세요.");
			}
			else {
				System.out.println("숫자를 입력하세요!");
				sc.next();
			}
		}
		int sum = 0;
		for (int i = 0; i <= inputVal; i+=2) {
			sum += i;
		}
		System.out.println("합계: " + sum);
	}

}
