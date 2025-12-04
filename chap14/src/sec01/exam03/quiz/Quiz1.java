package sec01.exam03.quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Quiz1 {
//	Quiz
//	FileOutputStream을 사용하여 
//	"C:/Temp/애국가1.dat" 파일을 생성하고
//	애국가1.dat 파일에 아래와 같은 문장을 출력하세요.
	
//	String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
//			+ "\n우리나라 만세 무궁화 삼천리 화려강산"
//			+ "\n대한사람 대한으로 길이 보전하세";
	
//  힌트: FileOutputStream은 바이트 기반 스트림이므로 문자열을 인코딩을 지정하여 바이트 배열로 변환해야 함
	
	public static void main(String[] args) {
		
		try (OutputStream os = new FileOutputStream("C:/Temp/애국가1.dat");)
		{
			
			String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
					+ "\n우리나라 만세 무궁화 삼천리 화려강산"
					+ "\n대한사람 대한으로 길이 보전하세";
			
			byte[] wText = song.getBytes("UTF-8");	// 글자 깨짐 방지를 위해 "UTF-8" 명시적 인코딩
			os.write(wText);
			
			os.flush();
			System.out.println("저장 성공..?");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
