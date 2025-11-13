package homework.condition;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		int trainingCode = sc.nextInt();
		String infoMessage = "";
		
		if(trainingCode > 0) {
			if(trainingCode > 5) {
				infoMessage = "목록에 있는 숫자만 입력해주세요.";
			}
			else if(trainingCode == 1) {
				infoMessage = "스쿼트 운동 시간입니다.";
			}
			else if(trainingCode == 2) {
				infoMessage = "데드리프트 운동 시간입니다.";
			}
			else if(trainingCode == 3) {
				infoMessage = "벤치 프레스 운동 시간입니다.";
			}
			else if(trainingCode == 4) {
				infoMessage = "풀업 운동 시간입니다";
			}
			else if(trainingCode == 5) {
				infoMessage = "오늘도 수고하셨습니다.";
			}
		}
		else {
			infoMessage = "양수만 입력해주세요.";
		}
		
		
		System.out.println(infoMessage);
		
		sc.close();
	}

}
