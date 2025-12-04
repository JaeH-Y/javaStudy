package sec01.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample {
	public static void main(String[] args) {
		
		try(OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
			Scanner sc = new Scanner(System.in);){
			
			System.out.print("문자를 입력해보세요: ");
			String text = sc.nextLine();
			
			byte a = 65;
			byte[] textB = text.getBytes();
			byte[] arr = {10, 20, 30, a};
			
			// 배열의 모든 바이트 출력
			os.write(textB);
			os.write(arr);
			
			os.flush();
			System.out.println("os flush 통과");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
