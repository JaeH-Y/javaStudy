package homework.Homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		System.out.print("이메일을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		if(!email.contains("@") || !email.substring(email.indexOf("@")).trim().equals("@goodee.co.kr")) {
			System.out.println("유효하지 않은 이메일입니다. ");
			return;
		}
		System.out.println("아이디 : " + email.substring(0, email.indexOf("@")).toUpperCase());
	}
}
