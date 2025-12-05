package sec02.exam01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharaterConvertStreamExample {
	
	// 파일에 문자를 저장하고, 저장된 문자를 다시 읽어오는 예제
	// 사용하는 소스 스트림(기본 스트림)이 바이트 기반 입출력 스트림일 때
	// 이들 스트림을 직접 사용하지 않고 각각 Writer와 Reader로 변환해서 사용
	public static void main(String[] args) {
		try {
			write("문자 변환 스트림을 사용합니다.");
			String data = read2();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void write(String str) throws IOException {
		OutputStream os = new FileOutputStream("C:/Temp/test1.txt");	// 바이트 기반 파일 출력 스트림
		// 문자열을 바이트 배열로 변환(인코딩)해서 출력해도 되지만
		// 편의를 위해 보조 스트림 연결해서 문자 -> 바이트로 자동 변환
		
		Writer wr = new OutputStreamWriter(os); // 문자 기반 출력 보조 스트림 연결
		
		wr.write(str);	// 매개값으로 문자열을 바로 쓸 수 있음
		
		wr.flush();
		wr.close();
		
	}
	
	public static String read() throws IOException {
		try(InputStream is = new FileInputStream("C:/Temp/test1.txt");){
			// 바이트 기반 파일 입력 스트림(try에 with-close로 선언)
			
			// 편의를 위해 보조 스트림 연결해서 바이트 -> 문자로 자동 변환
			Reader rd = new InputStreamReader(is);
			
			char[] cArr = new char[100];	// 보조 스트림 연결로 char배열 활용 가능
			int cLen = rd.read(cArr);	// 배열 크기만큼 읽어오기
			
			rd.close();	// Reader 종료
			
			String data = new String(cArr, 0, cLen); // 읽어진 길이만큼 String으로 변환
			
			return data;
		}
	}
	public static String read2() throws IOException {
		
		String data = null;
		InputStream is = new FileInputStream("C:/Temp/test1.txt");	// 바이트 기반 파일 입력 스트림
		Reader reader = new InputStreamReader(is);	// 문자 기반 입력 보조 스트림 연결
		BufferedReader br = new BufferedReader(reader);	// Reader에만 연결 가능한 보조 스트림
		
		data = br.readLine();	// 한 줄을 읽어 문자열로 변환해줌
		
		br.close();
		return data;
		
	}
	
	
}
