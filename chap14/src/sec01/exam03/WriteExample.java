package sec01.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample {
	public static void main(String[] args) {
		try(OutputStream os = new FileOutputStream("C:/Temp/test3.txt");){
				
				byte a = 65;
				// 출력할 바이트 배열
				byte[] arr = {10, 20, 30, 40, 50, 60, a};
				
				// 바이트 데이터를 배열로 출력 시 출력 범위를 지정 가능
				// 주어진 배열의 off번 째 위치부터 len개 까지의 바이트를 출력
				// 예: 1번 인덱스부터 3개를 출력
				os.write(arr, 1, 3);
				
				os.flush();
				System.out.println("os flush 통과");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
	}
}
