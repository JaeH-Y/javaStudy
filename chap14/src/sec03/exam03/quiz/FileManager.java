package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	public void deleteFile(File dir) {
		if(!dir.isDirectory()) {
			System.out.println("매개변수가 폴더가 아닙니다.");
			return;
		}
		
		File[] list = dir.listFiles();
		for(File f: list) {
			if(f.isFile()) {
				System.out.println(f.getName()+ "을 삭제합니다.");
				f.delete();
			}
		}
	}
}
