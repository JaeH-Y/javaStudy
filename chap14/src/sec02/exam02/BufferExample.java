package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {
	public static void main(String[] args) {
		
		// 현재 클래스가 있는 위치에서 파일을 찾아 절대 경로로 반환
		String originFilePath = BufferExample.class.getResource("status.png").getPath();
		String targetFilePath = "C:/Temp/targetImg.png";
		
		try {
			// 버퍼가 없는 기본 스트림 코드
			FileInputStream fis = new FileInputStream(originFilePath);
			FileOutputStream fos = new FileOutputStream(targetFilePath);
			
			// 버퍼가 있는 버퍼 보조 스트림 코드
			String originFilePath2 = BufferExample.class.getResource("status2.png").getPath();
			String targetFilePath2 = "C:/Temp/targetImg2.png";
			FileInputStream fis2 = new FileInputStream(originFilePath2);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			
			FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			
			// 기본 스트림 이용해서 복사
			long noneBufferSpendTime = readAndWrite(fis, fos);
			System.out.println("버퍼를 사용하지 않았을 때:\t" + noneBufferSpendTime + "ns");
			System.out.println();
			// 버퍼 보조 스트림 이용해서 복사
			long bufferedSpendTime = readAndWrite(bis, bos);
			System.out.println("버퍼를 했을 때:\t" + bufferedSpendTime + "ns");
			
			
			// 버퍼 없는 스트림 정리
			fis.close();
			fos.close();
			// 버퍼 있는 스트림 정리
			// 보조 스트림만 닫아도 내부에 연결된 기본 스트림(fis2, fos2)까지 자동으로 정리됨
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 입력 스트림에서 데이터를 읽고 출력 스트림으로 데이터를 보내는 코드(데이터 복사 코드)
	// 매개 변수의 타입은 바이트 기반 스트림으로 그림, 음악, 텍스트 증 모든 종류의 파일을 복사하기 위해
	public static long readAndWrite(InputStream is, OutputStream os) throws IOException {
		long startMili = System.currentTimeMillis();	// 시작 시간 저장
		long startNano = System.nanoTime();
		
		// 파일 복사
		// 원본 파일에서 읽은 1byte를 타겟 파일로 바로 출력
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		
		os.flush();
		
		long endMili = System.currentTimeMillis();
		long endNano = System.nanoTime();
		
		System.out.println("밀리초 계산: " + (endMili - startMili) + "ms");
		System.out.println("나노초 계산: " + (endNano- startNano) + "ns");
		return endNano - startNano;
	}
	
	
}
