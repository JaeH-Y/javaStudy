package sec01.exam11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public class ReadExample {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("C:/Temp/test7.txt");
			
			// 입력 스트림으로부터 한 문자씩 읽어오기
			// int(4byte) 타입으로 리턴
			int dataNum;
			while((dataNum = reader.read()) != -1) {
				System.out.println(dataNum);
			}
			
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
