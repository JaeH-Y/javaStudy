package sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("C:/Temp/test10.txt", true);
			
			// Writer는 문자열을 좀 더 쉽게 출력하기 위해서 write(String str) 메소드를 제공
			String str = "String Test";
			
			// 문자열 전체를 출력
			writer.write(str);
			
			// 1번 인덱스부터 2개까지의 문자열을 출력
			writer.write(str, 1, 2);
			
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
