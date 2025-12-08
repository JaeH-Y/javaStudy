package homework.homwork03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class FileDAO { 
	
	File rootFolder = new File("C:/Temp/chap14/homework03");
	
	 public boolean checkName(String file) { 
	  // File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌 
	  // 해당 파일이 있는지 없는지에 대한 boolean 값을 반환 
		 if(!rootFolder.exists()) rootFolder.mkdirs();
		 file = rootFolder.getPath() + "/" + file;
		 File isexist = new File(file);
		 return isexist.exists();
	 }
	 
	 public void fileSave(String file, String s) throws IOException { 
		 // 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고 
		 // String에 써서 저장 
		 file = rootFolder.getPath() + "/" + file;
		 Writer writer = new FileWriter(file);
		 writer.write(s);
		 
		 writer.flush();
		 writer.close();
	 } 
	 
	 public StringBuilder fileOpen(String file) throws IOException { 
		 // 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환 
		 file = rootFolder.getPath() + "/" +file;

		 Reader reader = new FileReader(file);
		 BufferedReader br = new BufferedReader(reader);
		 
		 String text = null;
		 StringBuilder buffer = new StringBuilder();
		 while((text = br.readLine()) != null) {
			 buffer.append(text + "\n");
		 }
		 br.close();
		 return buffer;
		 
	 } 
	 
	 public void fileEdit(String file, String s) throws IOException { 
		 // 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
		 // String에 써서 저장하되 이어서 저장될 수 있도록 함 
		 file = rootFolder.getPath() + "/" + file;
		 File route = new File(file);
		 Writer writer = null;
		 if(route.exists()) {
			 writer = new FileWriter(route, true);
		 }
		 else writer = new FileWriter(route);
		 
		 writer.write(s);
		 writer.flush();
		 writer.close();
	 }
}
