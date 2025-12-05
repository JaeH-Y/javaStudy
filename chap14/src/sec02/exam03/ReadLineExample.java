package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ReadLineExample {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath().replaceAll("bin","src").replaceAll("language.txt", "ReadLineExample.java"));
//		Reader reader = new FileReader();
//		System.out.println(ReadLineExample.class.getResource("language.txt").getPath().replaceAll("bin","src").replaceAll("language.txt", "ReadLineExample.java"));
		BufferedReader br = new BufferedReader(reader);	// 한 문자씩 읽는 것보다 행(라인) 단위로 문자열을 읽어 성능 향상
		
		StringBuffer mainBuffer = new StringBuffer();
		int i = 1;
		while(true) {
			String data = br.readLine();	// 더 이상 데이터를 읽을 수 없을 때 null 반환
			if(data == null) break;
			System.out.println(i++ + "\t" + data);
//			mainBuffer.append(subBuffer);
		}
//		System.out.println(mainBuffer);
	}
}
