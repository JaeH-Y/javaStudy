package sec01.exam06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test3.txt");
			
			// 한 번에 지정한 배열 크기만큼 바이트 데이터를 읽어 들이므로 훨씬 빠르게 읽을 수 있음
			// 길이가 100일 byte 타입의 빈 배열 생성
			byte[] buffer = new byte[5];
			
			while(true) {
				// 입력 스트림으로부터 배열의 길이만큼 읽어와서 buffer 배열에 저장
				int bLen = is.read(buffer,2,3);		// 배열의 길이보다 적을 경우 읽을 수 있는 바이트 수 만큼 읽음
				if(bLen == -1) break;
				System.out.println("byteLength : " + bLen);

				for(int i = 0; i < bLen; i++) {
					System.out.println(buffer[i]);
				}
			}
		}catch (IOException e) {
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
