package sec01.exam06.quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Quiz1 {
//	Quiz
//	FileInputStream을 사용하여 
//	애국가1.dat 파일을 읽어와서 콘솔에 표준 출력하세요.
	
//	[출력]
//	동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//	우리나라 만세 무궁화 삼천리 화려강산
//	대한사람 대한으로 길이 보전하세
//	남산위에 저 소나무 철갑을 두른듯
//	바람서리 불변함은 우리기상 일세
//	무궁화 삼천리 화려강산 
//	대한사람 대한으로 길이보전하세
	
//	힌트: FileInputStream은 바이트 기반 스트림이므로 
//	바이트 배열 단위로 읽어와서 바이트 배열에 저장하고 이를 문자열로 변환(String 생성자 이용)
	
	public static void main(String[] args) {
		// 바이트 기반 스트림은 바이트 단위로 데이터를 읽음 -> 문자의 인코딩 된 코드값
		try (InputStream is = new FileInputStream("C:/Temp/애국가1.dat");)
		{
			List<Byte> streamList = new ArrayList<Byte>();
			
			while(true) {
				byte[] arr = new byte[100];
				int len = is.read(arr);
				
				if(len == -1) break;
				
				for(int i = 0; i < len; i++) {
					streamList.add(arr[i]);
				}
			}
			byte[] strarr = new byte[streamList.size()];
			
			for(int i = 0; i < streamList.size(); i++) {
				strarr[i] = streamList.get(i);
			}
			String str = new String(strarr, StandardCharsets.UTF_8);
			
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
