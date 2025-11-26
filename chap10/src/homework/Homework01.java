package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		boolean isRunning = true;
		int randomVal = (int)(Math.random() * 50 + 1);
		
		Scanner sc = new Scanner(System.in);
		
		while(isRunning) {
			try {
				System.out.print("1~50 사이의 숫자: ");
				int input = sc.nextInt();
				
				if(input > randomVal) System.out.println("Down!");
				else if(input < randomVal) System.out.println("Up!");
				else isRunning = false;
				
			}
			catch (InputMismatchException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요");
				sc.nextLine();
			}
		}
		
		System.out.println("축하합니다~ 정답이에요");
		
	}
}
