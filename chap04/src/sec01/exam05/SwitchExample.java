package sec01.exam05;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; // 주사위 던지기를 구현
		
//		System.out.println(Math.random()); // 0.0 이상 1.0 미만의 임의의 실수값을 반환
		// 0.0 <= Math.random() < 1.0 사이의 double형 실수값
		// 0.0 <= Math.random() * 6 < 6.0 사이의 double형 실수값
		// 0 <= (int) (Math.random() * 6) < 6 사이의 int형 정수값
		// 1 <= (int) (Math.random() * 6) + 1 < 7 사이의 int형 정수값
		
		// 공식화: (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {	
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:	// 옵션
				System.out.println("6번이 나왔습니다.");
		}
		// (정리)
		// if문 : 조건식의 결과가 true/false 냐에 따라 실행
		// switch : 변수의 값에 따라 실행문을 선택해서 실행
		// => 특정 값에 따라 명확하게 분기 처리할 때 가장 적합(코드가 간결해짐)
		
		
		
		// Quiz
//		철수는 스위치로 조명을 조절하는 스마트 조명을 설치했어요. 
//		조명의 밝기는 사용자가 입력한 값에 따라서 조절돼요. 
//		아래와 같은 기준을 따른다고 했을 때, 
//		사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성해주세요.
//
//		- 0 : 조명을 끕니다.
//		- 1 : 어두운 조명입니다.
//		- 2 : 밝은 조명입니다.
//		- 3 : 매우 밝은 조명입니다.
//
//		입력 값이 위의 기준에 해당하지 않으면 "올바른 입력이 아닙니다."라고 출력하세요.
//		
//		[출력]
//		조명의 밝기를 입력하세요 (0~3): 3
//		현재 조명의 밝기: 매우 밝은 조명입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조명의 밝기를 입력하세요(0~3): ");
		int lightLevel = sc.nextInt();
		
		System.out.print("현재 조명의 밝기: ");
		switch (lightLevel) {
			case 0:
				System.out.println("조명을 끕니다.");
				break;
			case 1:
				System.out.println("어두운 조명입니다.");
				break;
			case 2:
				System.out.println("밝은 조명입니다.");
				break;
			case 3:
				System.out.println("매우 밝은 조명입니다.");
				break;
			default:
				System.out.println("올바른 입력이 아닙니다.");
		}
		
	}

}
