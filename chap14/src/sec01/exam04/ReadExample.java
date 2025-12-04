package sec01.exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		// 데이터 출발지를 test1.txt 파일로 하는 바이트 기반 파일 입력 스트림을 생섬
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test1.txt");
			
			while(true) {
				// 입력 스트림으로부터 1byte씩 읽어오고
				// 읽은 바이트를 리턴함
				int data = is.read();
				if(data == -1) break;	// 파일 끝에 도달하여 더 이상 읽어올 바이트가 없을 경우
				System.out.println(data);
			}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
