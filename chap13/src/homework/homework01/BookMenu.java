package homework.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
	// Scanner 객체 생성
	// BookController 객체 생성
	Scanner sc = new Scanner(System.in);
	BookController controller = new BookController();
	
	public void mainMenu() {
	  // === 구디 도서관에 오신걸 환영합니다 ===
	  // 원하시는 업무의 번호를 선택하세요.
	  // 1. 새 도서 추가 -> insertBook() 호출
	  // 2. 도서 전체 조회 -> selectList() 호출
	  // 3. 도서 검색 조회 -> searchBook() 호출
	  // 4. 도서 삭제 -> deleteBook() 호출
	  // 5. 도서 오름차순 정렬 -> ascBook() 호출
	  // 9. 종료 -> "프로그램을 종료합니다." 출력 후 종료
	  // 메뉴 선택 : 
	  // 숫자 입력 받아서 기능 수행하기
	  // 만일 1,2,3,4,5,9 외의 숫자 입력하면 -> "잘못 입력하였습니다. 다시 입력해주세요." 출력
	  while (true) {
		System.out.println("=== 구디 도서관에 오신걸 환영합니다 ===");
		System.out.println("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가"); // insertBook()
		System.out.println("2. 도서 전체 조회"); // selectList()
		System.out.println("3. 도서 검색 조회"); // searchBook()
		System.out.println("4. 도서 삭제"); // deleteBook()
		System.out.println("5. 도서 오름차순 정렬"); // ascBook()
		System.out.println("9. 종료"); // "프로그램을 종료합니다." 출력 후 종료
		System.out.print("메뉴 선택: ");
		
		int menuNo = sc.nextInt();
		sc.nextLine();
		switch (menuNo) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: ascBook(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
		}
	  }
	}

	// 1. 새 도서 추가 view 메소드
	public void insertBook(){
	    // 1. 도서명(String title) 입력 받기
	    // 2. 저자명(String author) 입력 받기
	    // 3. 장르(int category) 입력 받기
	    // 4. 가격(int price) 입력 받기
	    // 5. 매개변수 생성자를 이용하여 Book 객체 생성
	    // 장르명 입력은 숫자로 받지만 객체 생성할 때는 문자열로 넘기기
	    // (1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타)
	    // 6. BookController의 insert로 Book 객체 전달
		System.out.print("도서명 : ");
		String name = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 : ");
		int cat = sc.nextInt();
		sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		String catText = null;
		switch (cat) {
			case 1:
				catText = "인문";
				break;
			case 2:
				catText = "자연과학";
				break;
			case 3:
				catText = "어린이";
				break;
			default:
				catText = "기타";
				break;
		}
		controller.insertBook(new Book(name, author, catText, price));
	}
	// 2. 도서 전체 조회 view 메소드
	public void selectList(){
	    // 1. BookController의 selectList 메소드 호출
	    // -> 결과값을 임의의 리스트 bookList생성하여 대입
	    // 2. 조건식 이용
	    // 2-1. bookList가 비어있는 경우
	    // -> "존재하는 도서가 없습니다."라는 문구 출력
	    // 2-2. bookList가 비어있지 않은 경우
	    // -> 반복문을 통해 bookList안의 Book 객체들 출력
		List<Book> list = new ArrayList<Book>();
		list = controller.selectList();
		if(list.size() < 1) {
			System.out.println("존재하는 도서가 없습니다.");
			return;
		}
		for(Book b : list) {
			System.out.println(b);
		}
	}
	// 3. 도서 검색 조회 view 메소드
	public void searchBook(){
	    // 1. 검색할 도서명 키워드 입력 받기(String keyword)
		// 2. BookControllr의 searchBook 메소드로 위의 keyword 전달
		// -> 결과 값을 임의의 리스트 searchList를 생성후 대입
		// -> 키워드가 완전한 도서명이 아니라 도서명의 일부 일 수 있고
		// 일부 키워드를 입력한 경우 해당 키워드를 포함하는 여러 개의 도서 조회됨
		// 단일 객체가 아니라 리스트로 조회
		// 3. 조건식 이용
		// 3-1. searchList가 비어 있는 경우
		// -> "검색 결과가 없습니다."라는 문구 출력
		// 3-2. searchList가 비어 있지 않은 경우
		// -> 반복문으로 searchList 안의 Book 객체 출력
		System.out.print("검색어 : ");
		String word = sc.nextLine();
		List<Book> list = controller.searchBook(word);
		if(list.size() < 1) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		for(Book b : list) {
			System.out.println(b);
		}
	}
	// 4. 도서 삭제 view 메소드
	public void deleteBook(){
	    // 1. 삭제할 도서명 입력 받기 (String title)
	    // 2. 삭제할 저자명 입력 받기 (String author)
	    // -> 같은 도서명을 가졌지만 저자명이 다른 경우
	    // 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
	    // 3. BookController의 deleteBook() 메소드로 title, author 전달
	    // -> 결과값을 임의의 Book(참조변수명 remove) 객체에 대입
	    // 4. 조건식 이용
	    // 4-1. remove가 존재하는 경우
	    // -> "성공적으로 삭제되었습니다." 문구 출력
	    // 4-2. remove가 존재하지 않는 경우
	    // -> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
		System.out.print("도서명 : ");
		String delName = sc.nextLine();
		System.out.print("저자명 : ");
		String delAuthor = sc.nextLine();
		
		if(controller.deleteBook(delName, delAuthor) == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			return;
		}
		System.out.println("성공적으로 삭제되었습니다.");
	}
	// 5. 도서 오름차순 정렬 view 메소드
	public void ascBook(){
	    // 1. BookController의 ascBook() 메소드 호출
	    // 2. 메소드 호출 결과가 1이면 성공, 그 외 실패
	    // 3. 성공시 "정렬에 성공하였습니다." 출력 후 전체 목록 조회
	    // 4. 실패시 "정렬에 실패하였습니다." 출력
		if(controller.ascBook() == 1) System.out.println("정렬에 성공하였습니다.");
		else System.out.println("정렬에 실패하였습니다.");
	}
}
