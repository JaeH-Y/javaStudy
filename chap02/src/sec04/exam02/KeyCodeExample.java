package sec04.exam02;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {	// 발생한 예외를 모니터(콘솔)에 출력하고 끝내(프로그램 종료해)라
		int keyCode;
		
		// 키보드로부터 키코드를 읽어올 떄 예외가 발생할 수 있음 -> 예외처리 필요(추후 학습)
		keyCode = System.in.read();  // 콘솔에서 키보드로부터 입력을 받을 때까지 기다림(대기)
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}
