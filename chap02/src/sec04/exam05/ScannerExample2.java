package sec04.exam05;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 참고:
	    // next()는 문자열 하나(공백 전까지)를 읽음 -> 예: "hello"
	    // nextLine()은 버퍼에서 한 줄 전체를 읽음
	    // 한 줄이란? -> 입력된 문자열에서 개행 문자(\n 또는 \r\n)까지를 포함한 라인
	    // 결과값으로는 -> 개행 문자 전까지의 문자열만 반환
	    // 개행 문자는 버퍼에서 제거되지만, 반환값에 포함되지 않음
		
		System.out.println("단어를 입력하세요.");
		
		while(sc.hasNext()) {
			String nextWord = sc.next();	// 공백을 만나게 되면 공백 전까지 읽어들임
			if("quit".equals(nextWord)) break;
			
			System.out.println("입력값: " + nextWord);
		}
		
		System.out.println("문장을 입력하세요.");
		while(sc.hasNextLine()) {
			String nextSentence = sc.nextLine();	// 공백을 만나게 되면 공백 전까지 읽어들임
			if("quit".equals(nextSentence)) break;
			
			System.out.println("입력값: " + nextSentence);
		}
		
		sc.close();
	}

}
