package sec01.exam12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

public class ReadExample {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("C:/Temp/test8.txt");
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Temp/test8.txt"), StandardCharsets.UTF_8));
			// 한 번에 지정한 문자 배열의 크기만큼 읽을 수 있으므로 빠르게 문자 데이터를 읽을 수 있음
			// 길이가 100인 char 타입의 빈 배열 생성 -> 최대 100개의 문자를 읽을 수 있다.
			char[] buffer = new char[100];
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
