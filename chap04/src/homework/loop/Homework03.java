package homework.loop;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(;;) {
			System.out.print("입력: ");
			String inputT = sc.nextLine();
			if(inputT.equals("탈출")) {
				System.out.println("프로그램종료");
				return;
			}
			System.out.println(inputT);
		}
		
	}

}
