package sec04.exam05.quiz;

import java.io.IOException;
import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
//	[입력]    [출력]
//	10 20 => 10,20
	
	public static void main(String[] args) throws IOException {
		int num1;
		int num2;
		
		Scanner sc1 = new Scanner(System.in);
		
		num1 = sc1.nextInt();
		num2 = sc1.nextInt();
		
		System.out.println("출력\n" + num1 + ", " + num2);
		System.out.println("퀴즈 종료");

//		System.out.println("출력\n" + sc1.nextInt() + ", " + sc1.nextInt());
		// 이런식으로 하면 변수 없이 직접 받아도 됨.
		
		
		// 주의!
		// nextInt() 또는 next()는 입력 후 개행 문자(\n)를 버퍼에 남김
		// 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감
		// 해결법 : 중간에 nextLine()을 한번 호출해서 버퍼를 정리.
		
		System.out.print("나이: ");
		int age = sc1.nextInt();
		System.out.print("이름: ");
		sc1.nextLine();	// 버퍼 정리(중요!)
		String name = sc1.nextLine();
		
		
		System.out.println("너의 나이는: " + age);
		System.out.println("너의 이름은: " + name);
		sc1.close();
	}
}
