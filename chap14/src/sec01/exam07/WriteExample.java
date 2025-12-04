package sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림 생성
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("C:/Temp/test7.txt");
			
			String sc = "test7.txt";
			
			// 3바이트로 저장됨
//			char a = 'A';
//			char b = 'B';
//			char c = 'C';
			
			// 9바이트로 저장됨
			// 문자 -> 바이트 변환 시 자동 인코딩
			// 한글 1자 UTF-8 인코딩 시 3바이트
			char a = '가';
			char b = '나';
			char c = '다';
			
			// 한 문자씩 세 번 출력
			writer.write(a);
			writer.write(b);
			writer.write(c);
			writer.write(sc);
			
			writer.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
