package sec01.exam03_2.quiz;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	Point 클래스는 2차원 좌표 정보를 저장하는 클래스입니다.
//	3차원 좌표 정보를 저장하기 위해 Point 클래스를 상속받아 Point3D 클래스를 구현하였습니다.
//	실행 클래스에 맞도록 Point 클래스의 하위 클래스인 Point3D 클래스의 생성자와 
//	location() 메소드를 오버라이드하여 구현하시오.
//
//	[입력]
//	1 2 3
//	
//	[출력]
//	x=1, y=2, z=3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		Point3D p = new Point3D(x, y, z);
		System.out.println(p.location());
	}

}
