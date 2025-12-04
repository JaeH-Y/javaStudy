package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 입출력 스트림이란?
// Stream: 개울(시내), 흐르다 = 데이터가 흘러 지나감
// 데이터를 연속된 흐름으로 읽고/쓰는 것으로 입출력 할 수 있게 도와주는 클래스
// Java에서는 스트림을 통해 파일, 네트워크, 키보드, 메모리 등에서 데이터를 주고받을 수 있음

// 입력 스트림: 외부 -> 프로그램으로 데이터 읽기
// 출력 스트림: 프로그램 -> 외부로 데이터 쓰기

// 스트림의 종류
// 구분 바이트 기반(1byte) 문자 기반(2byte = char)
// 입력 InputStream		Reader
// 출력 OutputStream		Writer

// 바이너리 파일, 바이너리 데이터란?
// 말 그대로 0 과 1로 이루어진 이진 데이터
// 우리가 다루는 데이터는 크게 두 종류로 나눌 수 있음
// 1. 텍스트 데이터: 사람이 읽을 수 있는 문자 중심의 데이터(예: "hello", "123", "this is text")
// 2. 바이너리 데이터: 사람이 읽을 수 없는 0과 1의 이진 형식으로 저장된 데이터
// (예: 이미지, 동영상, 음악, pdf, 실행파일 등 텍스트가 아닌 모든 데이터)

public class WriteExample {
	public static void main(String[] args) {
		
		// 데이터 도착지를 text1.txt 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test1.txt");	// 바이트를 파일에 출력해서 저장하는 기능을 가짐
			
			// 출력 가능한 바이트 범위 1바이트니까 0 ~ 255
			byte a = 10;	// 실제로는 0000 1010;
			byte b = 20;
			byte c = 30;
			
			// 출력 스트림을 이용해 출력하는 메소드
			// 참고: 매개변수 타입이 int인 이유? byte로 받으면 -128 ~ 127 이므로 int로 전달해서 1바이트만 뽑아냄
			os.write(a);
			os.write(b);
			os.write(c);
			// write()를 한다고 해서 바로 출력 스트림을 통해 데이터가 흘러가는 것이 아님
			// 버퍼(임시 저장 공간)에 쌓임
			// 버퍼: 물건을 잠시 담아두는 창고
			// 출력 스트림: 물건을 외부로 보내는 트럭
			
			// 반드시 write() 후에 flush() 수행
			os.flush();	// 버퍼를 비움(버퍼에 쌓인 데이터를 한꺼번에 출력)
			
			System.out.println("저장 완료.");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				os.close();	// 출력 스트림이 사용했던 자원들(메모리)을 풀어주기 위해
				// 참고: close() 안에서도 스트림을 닫기 전에 flush() 기능을 수행함
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 중요: try-with-resources
		// 리소스를 자동으로 닫아주는 try 문법
		// close()를 명시적으로 호출하지 않아도, try 블록이 끝나거나 예외가 발생되는 즉시 자동으로 자원 정리
		// AutoCloseable을 구현한 클래스는 try-with-resources로 자동 닫기 가능
		
		try(OutputStream os2 = new FileOutputStream("C:/Temp/test1.txt")) {
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os2.write(a);
			os2.write(b);
			os2.write(c);
			
			os2.flush();
			
			System.out.println("os2 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
