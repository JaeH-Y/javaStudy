package homework.Homework04;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer buff = new StringBuffer();
		while(true) {
			System.out.print("문자열 : ");
			String word = sc.nextLine();
			
			if(word.equalsIgnoreCase("n")) break;
			
			buff.append(word);
		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println("최종 문자열 : " + buff.toString());
		sc.close();
	}
}
