package sec03.exam03.quiz;

import java.io.File;

public class Quiz1 {
//	Quiz
//	C 드라이브 아래에 test/sub 폴더를 생성하는데
//	아래와 같이 test/sub 경로에 오늘 날짜 이름의 폴더를 생성하세요.
//	오늘 날짜 정보는 LocalDate를 통해서 가져옵니다.

//	C:/test/sub/2025/06/06

//	해당 폴더가 없을 때만 생성될 수 있도록 조건문을 반드시 추가하세요.

//	상황에 맞게 아래의 문장을 출력하세요.

//	[출력]
//	폴더 생성 성공
//	폴더 생성 실패
//	이미 존재하는 폴더
	
	public static void main(String[] args) {
		
		File creDir = new File("C:/Temp/test/sub/2025/12/05");
		
		if(!creDir.exists()) {
			creDir.mkdirs();
		}else {
			System.out.println("이미 존재하는 폴더");
			return;
		}
		
		if(creDir.exists()) {
			System.out.println("폴더 생성 성공");
		}
		else {
			System.out.println("폴더 생성 실패");
		}
		
	}

}
