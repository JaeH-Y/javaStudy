package sec03.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;	// 바이트 기반 입력 스트림
		Reader reader = new InputStreamReader(is); // 문자 기반 Reader로 변환
		
		BufferedReader br = new BufferedReader(reader);	// 라인 단위로 읽기 위해 추가 연결
		
		while(true) {
			System.out.print("입력하세요: ");	// 바이트 기반 출력 스트림
			String lineStr = br.readLine();	// 라인 단위로 문자열을 읽음
			if(lineStr == null) break;
			if("q".equalsIgnoreCase(lineStr) || "quit".equalsIgnoreCase(lineStr)) break;
			System.out.println("입력된 내용: " + lineStr);
			
		}
		
		br.close();
		
	}
}
