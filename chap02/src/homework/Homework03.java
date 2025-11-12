package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char firstC;
		char secondC;
		char thirdC;
		
		System.out.print("문자열을 입력하세요 : ");
		String text = sc.nextLine();
		if(text.length() >= 3) {
			firstC = text.charAt(0);
			secondC = text.charAt(1);
			thirdC = text.charAt(2);
		}
		else return;
		
		System.out.printf("첫번째 문자 : %c \n", firstC);
		System.out.printf("두번째 문자 : %c \n", secondC);
		System.out.printf("세번째 문자 : %c \n", thirdC);
		
		sc.close();
	}
}
