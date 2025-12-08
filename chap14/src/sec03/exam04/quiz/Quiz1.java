package sec03.exam04.quiz;

import java.io.File;
import java.util.UUID;

public class Quiz1 {
//	Quiz
//	디렉터리 이름으로 UUID 사용하기
//	임시 작업 디렉터리, 사용자 세션 디렉터리 등을 만들 때 UUID를 사용하면 
//	충돌 없는 고유 디렉터리를 쉽게 만들 수 있습니다.
	
//	C:/test/sub 폴더 아래에 새로운 임시 폴더를 생성하세요.
//	폴더명은 UUID를 활용하여 구성하세요.
//	단, 폴더명에 -(하이픈)은 없어야 합니다.
	
//	[출력]
//	임시 폴더 생성: C:\test\sub\4e9719b5f849425cb62cfc2711772a6b
	
	public static void main(String[] args) {
		File rootSaveDir = new File("C:/Temp/test/sub");
		
		if(!rootSaveDir.exists()) {
			if(!rootSaveDir.mkdirs()) {
				System.out.println("폴더 생성 중 오류");
				return;
			}
		}
		else {
			System.out.println("root폴더가 이미 존재합니다.");
		}
		
		String dirUUID = UUID.randomUUID().toString().replace("-","");
		System.out.println(dirUUID);
		File randSaveDir = new File(rootSaveDir, dirUUID);
		
		if(!randSaveDir.exists()) {
			if(!randSaveDir.mkdirs()) {
				System.out.println("UUID 폴더 생성 중 오류");
				return;
			}
			System.out.println("폴더 생성 완료 " + randSaveDir.getPath());
			System.out.println("폴더 이름: " + dirUUID);
		}else {
			System.out.println("이미 존재하는 폴더 이름입니다.");
		}
		
	}

}
