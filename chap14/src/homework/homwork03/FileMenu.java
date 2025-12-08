package homework.homwork03;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileMenu { 
	 // 필드  
	FileController controller = new FileController();
	Scanner sc = new Scanner(System.in);
	
	 public void mainMenu() throws IOException { 
//		 ***** My Note ***** 
//		 1. 노트 새로 만들기 -> fileSave() 
//		 2. 노트 열기 -> fileOpen() 
//		 3. 노트 열어서 수정하기 -> fileEdit() 
//		 9. 끝내기 -> “프로그램을 종료합니다.” 출력 후 종료 
//		 메뉴 번호 :  
		 // 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		 
		 while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int menuNo;
			try {
				menuNo = Integer.parseInt(sc.nextLine());
			}
			catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				continue;
			}
			switch (menuNo) {
				case 1: fileSave(); break;
				case 2: fileOpen(); break;
				case 3: fileEdit(); break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
		}
	 }
	 
	 public void fileSave() throws IOException { 
		 
		 // "exit"를 입력할 때까지 사용자가 입력하게 하고 
		 // 그 값들을 StringBuilder에 저장 
		 StringBuilder buffer = new StringBuilder();
		 while(true) {
			 System.out.println("파일에 저장할 내용을 입력하세요.");
			 System.out.println("exit 라고 입력하면 종료됩니다.");
			 System.out.print("내용 : ");
			 String inputT = sc.nextLine();
			 if("exit".equalsIgnoreCase(inputT)) break;
			 buffer.append(inputT + "\n");
		 }
		 // 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면 
		 // "이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)"가 출력됨 
		 // y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 
		 // StringBuilder 넘김 
		 // n를 입력하면 "저장할 파일 명을 입력해주세요 ~"가 다시 나오게끔 반복 
		 // 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면  
		 // 파일 명과 내용을 fc에 fileSave 메소드로 넘김 
		 while(true) {
			 System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			 String fileName = sc.nextLine();
			 if(controller.checkName(fileName)) {
				 System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				 String dicision = sc.nextLine();
				 if("n".equalsIgnoreCase(dicision)) continue;
			 }
			 controller.fileSave(fileName, buffer);
			 break;
		 }
	 } 
	 
	 public void fileOpen() throws IOException { 
	  
		 // 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		 // 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 
		 // 반환 값 출력 
		 // 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
		 System.out.println("열 파일 명 : ");
		 String openName = sc.nextLine();
		 
		 if(controller.checkName(openName)) {
			StringBuilder sb = controller.fileOpen(openName);
			System.out.println(sb);
		 }
		 else System.out.println("없는 파일입니다.");
	 } 

	public void fileEdit() throws IOException { 
	  
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨 
		// 반환 값이 false일 경우 "없는 파일입니다." 출력 후 mainMenu()로 돌아감 
		// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
		// exit를 입력하면 반복문 종료 후
		// fc의 fileEdit()에 파일 명과 StringBuilder 전달 
		System.out.println("수정할 파일 명 : ");
		String editName = sc.nextLine();
		
		if(!controller.checkName(editName)) {
			System.out.println("없는 파일입니다.");
			return;
		}
		
		StringBuilder buffer = new StringBuilder();
		while(true) {
			 System.out.println("파일에 저장할 내용을 입력하세요.");
			 System.out.println("exit 라고 입력하면 종료됩니다.");
			 System.out.print("내용 : ");
			 String inputT = sc.nextLine();
			 if("exit".equalsIgnoreCase(inputT)) break;
			 buffer.append(inputT + "\n");
		 }
		 controller.fileEdit(editName, buffer);
	 }
}