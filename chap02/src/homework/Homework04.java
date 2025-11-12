package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char text = sc.nextLine().charAt(0);
		int uniNum = text;
		
		System.out.printf("%c의 유니코드 : %d", text, uniNum);
		
		sc.close();
	}

}
