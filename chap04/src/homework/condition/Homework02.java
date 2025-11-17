package homework.condition;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temperature = sc.nextInt();
		
		String message = "";
		
		// Early Return Pattern
		// 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조.
		// 장점 1) 코드 가동성이 좋아짐. 2) 코드의 중첩을 줄일 수 있음
		
		if(month >=3 && month <= 5) {
			message = "봄";
		}
		else if(month>=6 && month <= 8) {
			message = "여름 ";
			if(temperature >= 35) {
				message += "폭염 경보";
			}
			else if(temperature >= 33) {
				message += "폭염 주의보";
			}
		}
		else if(month>=9 && month <= 11) {
			message = "가을";
		}
		else if(month == 12 || month == 1 || month == 2) {
			message = "겨울 ";
			if(temperature <= -15) {
				message += "한파 경보";
			}
			else if(temperature <= -12) {
				message += "한파 주의보";
			}
		}
		else {
			message = "해당 계절은 없습니다.";
		}
		
		System.out.println(message);
		
		sc.close();
	}

}
