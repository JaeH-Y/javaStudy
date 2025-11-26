package sec01.exam15;

public class StringGetBytesExample {
	public static void main(String[] args) {
		// 문자열을 바이트 배열로 변환
		// 쓰는 경우
		// 1. 파일에 문자열을 바이트로 저장할 때
		// 2. 네트워크 전송 시 문자열을 바이트로 변환할 때
		// 3. 문자열 암호화/해시 처리할 때
		
		String str = "안녕하세요";
		
		// 인코딩: 문자열을 바이트 배열로 바꾸는 과정
		byte[] bytes1 = str.getBytes();	// 인코딩 방식 미지정 시 기본 문자셋(UTF-8) 사용
		System.out.println(bytes1.length);	// 15
		// 한글 1글자를 UTF-8로 인코딩하면 3바이트가 되고, EUC-KR로 인코딩하면 2바이트가 됨
		
		// 디코딩: 바이트 배열을 문자열로 다시 복원하는 과정
		String str1 = new String(bytes1);
		
		System.out.println(str1);
		
		try {
			// 특정 문자셋으로 인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.len : " + bytes2.length);
			// 특정 문자셋으로 디코딩(여기서 "EUC-KR"이 없으면 디코딩 하면서 글자 깨짐)
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String : " + str2);
		}
		catch (Exception e) {
		}
		
	}
}
