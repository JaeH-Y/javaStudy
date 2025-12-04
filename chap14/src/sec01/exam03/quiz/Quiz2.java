package sec01.exam03.quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz2 {
//	Quiz
//	FileOutputStream을 사용하여 
//	"C:/Temp" 폴더에 생성된 애국가1.dat 파일에 아래와 같은 문장을 추가하세요.
//	실행을 할 때마다 한 번씩 추가돼야 합니다.
	
//	String str = "\n남산위에 저 소나무 철갑을 두른듯"
//			+ "\n바람서리 불변함은 우리기상 일세"
//			+ "\n무궁화 삼천리 화려강산 "
//			+ "\n대한사람 대한으로 길이보전하세";
	
//  힌트: FileOutputStream 생성자의 두 번째 매개변수(append: 덧붙이다)를 설정
	
	public static void main(String[] args) {
		
		StringBuffer buff = new StringBuffer();
		List<Byte> bList = new ArrayList<>();
		try(InputStream is = new FileInputStream("C:/Temp/애국가1.dat");
			)
		{
			while(true) {
				byte[] reader = new byte[100];
				int len = is.read(reader);
				if(len == -1) break;
				
				for(int i = 0; i < len; i++) {
					bList.add(reader[i]);
				}
			}
			System.out.println("========");
			System.out.println(buff);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (OutputStream os = new FileOutputStream("C:/Temp/애국가1.dat");) 
		{
//			 OutputStream os = new FileOutputStream("C:/Temp/애국가1.dat", true); <- append true로 설정할 경우 이어서 쓰기 가능
			byte[] old = new byte[bList.size()];
			for(int i = 0; i < bList.size(); i++) {
				old[i] = bList.get(i);
			}
			
			String str = "\n남산위에 저 소나무 철갑을 두른듯"
			+ "\n바람서리 불변함은 우리기상 일세"
			+ "\n무궁화 삼천리 화려강산 "
			+ "\n대한사람 대한으로 길이보전하세";
			
			byte[] nText = str.getBytes("UTF-8");
			
			os.write(old);
			os.write(nText);
			
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
