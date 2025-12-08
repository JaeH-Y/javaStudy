package homework.homwork03;

import java.io.IOException;

public class FileController { 
	 // 필드 
	 FileDAO dao = new FileDAO();
	 public boolean checkName(String file) { 
	  // FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고  
	  // 그리고 그 반환 값을 그대로 받아 또 반환해줌 
		 return dao.checkName(file);
	 } 
	 
	 public void fileSave(String file, StringBuilder sb) throws IOException { 
	  // 매개변수로 넘어온 sb를 String으로 바꿔 
	  // fd의 fileSave()메소드 매개변수로 
	  // file과 String을 넘김 
		 String content = sb.toString();
		 System.out.println(content);
		 dao.fileSave(file, content);
	 } 
	 
	 public StringBuilder fileOpen(String file) throws IOException { 
	  // fd의 fileOpen() 매개변수로 file을 넘겨주고 
	  // 그 반환 값을 그대로 받아 또 반환 
		 return dao.fileOpen(file);
	 } 
	 
	 public void fileEdit(String file, StringBuilder sb) throws IOException { 
	  // 매개변수로 넘어온 sb를 String으로 바꿔 
	  // fd의 fileEdit()메소드 매개변수로 
	  // file과 String을 넘김 
		 String content = sb.toString();
		 dao.fileEdit(file, content);
	 } 
}
