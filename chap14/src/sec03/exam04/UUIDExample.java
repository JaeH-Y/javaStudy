package sec03.exam04;

import java.io.File;
import java.util.UUID;

public class UUIDExample {

	public static void main(String[] args) {
		// UUID
		// Universally Unique Identifier의 약자로,
		// 전 세계에서 유일하게 식별될 수 있는 값을 만들기 위한 표준 규칙
		// 충돌 걱정 없이 고유한 식별자를 생성하는 표준 128비트 문자열(16진수 0~F는 4bit로 표현됨)

		// 형식: 32개의 16진수 + 하이픈 4개 → 총 36자
		// xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
		
		// 중복 가능성: 사실상 없음(거의 불가능)
		// 주요 용도: 식별자(ID), 파일 이름, DB PK 등 고유해야 되는 값들에 적용
		
		// Java의 randomUUID()는 
		// UUID의 4가지 주요 버전 중에 v4(랜덤 기반 무작위 값)에 해당 - 가장 널리 사용됨
		// v1~v5까지 존재
		
//		UUID uuid = UUID.randomUUID();
//		System.out.println(uuid);
		
		
		// 실무 예: 업로드 시 파일 이름 중복 방지
		// 사용자가 파일을 업로드할 때, 동일한 이름의 파일이 존재하면 덮어쓰기 위험이 있으므로
		// UUID를 활용해 고유한 이름으로 저장
		// DB에 원본 파일명은 따로 기록해두고, 파일 서버에는 랜덤한 파일명으로 올림
		String uploadDirPath = "C:/upload";
		File dirPath = new File(uploadDirPath);

		if(!dirPath.exists()) {
			if(!dirPath.mkdirs()) {
				System.out.println("업로드 폴더 생성 실패");
				return;
			}
		}
		
		String originalName = "photo.png";
		String extension = originalName.substring(originalName.lastIndexOf("."));
//		System.out.println(extension);
		String savedName = UUID.randomUUID().toString() + extension;
		
		File dest = new File(dirPath, savedName);
		
		try {
			boolean created = dest.createNewFile();
			
			if(created) {
				System.out.println("저장 파일명: " + dest.getName());
			}else {
				System.out.println("파일 생성 실패(이미 존재)");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
