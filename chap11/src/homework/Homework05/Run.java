package homework.Homework05;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(sc){
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("생년월일 : ");
			String birthDay = sc.nextLine();
			
			String pw = name.substring(0, 1) + birthDay.substring(2, 4) + birthDay.substring(6) + name.substring(1);
			
			System.out.println("암호 : " + pw);
		}
	}
}
