package board;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import board.dto.BoardDTO;
import board.service.BoardService;
import board.service.BoardServiceImpl;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static BoardService boardService = new BoardServiceImpl();
	public static void main(String[] args) {
		int menuNo = 0;
		
		while (true) {
			// 메뉴판 출력
			menu();
			
			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			// 0 -> 프로그램 종료
			if (menuNo == 0) break;
				
			// 메뉴 선택
			switch (menuNo) {
				case 1: list(); break;   // 게시글 목록
				case 2: select(); break; // 게시글 조회
				case 3: insert(); break; // 게시글 등록
				case 4: update(); break; // 게시글 수정
				case 5: delete(); break; // 게시글 삭제
			}
		}
		System.out.println("프로그램을 종료합니다!");
	}
	
	/**
	 * 메뉴판
	 */
	public static void menu() {
		System.out.println("========== 게시판 ==========");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 입력: ");
	}
	
	/**
	 *  게시글 목록
	 *  
	*/
	
	public static void list() {
		System.out.println("===== 게시글 목록 =====");
		
		// 게시글 목록 데이터 요청
		List<BoardDTO> boardList = boardService.list();
		
		printAll(boardList);
	}
	
	/**
	 * 게시글 조회
	 */
	public static void select() {
		System.out.println("===== 게시글 조회 =====");
		System.out.print("글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		// 게시글 데이터 요청
		BoardDTO board = boardService.select(no);
		if(board == null) return;
		printOne(board);
	}
	
	/**
	 * 게시글 등록
	 * 제목, 작성자, 내용 입력받아 넘김
	 */
	public static void insert() {
		System.out.println("===== 게시글 등록 =====");
		BoardDTO board = input();
		
		// 게시글 등록 요청
		int result = boardService.insert(board);
		System.out.println("result 전파: " + result);
	}
	
	/**
	 * 게시글 수정
	 * 작성자 체크 버전, 미체크 버전 구현
	 */
	public static void update() {
		System.out.println("===== 게시글 수정 =====");
		
		System.out.println("작성자 확인 후 수정하시겠습니까?");
		System.out.print("작성자 일치 확인(여: 1 / 부: 2 ~): ");
		int checking = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정 게시글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		boolean ischeck = checking == 1 ? true : false;
		BoardDTO board = input();
		
		int result = boardService.update(no, board, ischeck);
		if(result == -1) return;
		else if(result < 1) {
			System.out.println("알 수 없는 이유로 게시글이 수정되지 않았습니다.");
		}
		else {
			System.out.println("★ 게시글이 수정되었습니다.");
		}
	}
	
	
	public static void delete() {
		System.out.println("===== 게시글 삭제 =====");
		
		System.out.println("작성자 확인 후 삭제하시겠습니까?");
		System.out.print("작성자 일치 확인(여: 1 / 부: 2 ~): ");
		int checking = sc.nextInt();
		sc.nextLine();
		
		System.out.print("삭제 게시글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();
		
		boolean ischeck = checking == 1 ? true : false;
		String writer = null;
		if(ischeck) {
			System.out.print("작성자: ");
			writer = "";
			writer = sc.nextLine();
		}
		
		int result = boardService.delete(no, ischeck, writer);
		if(result == -1) return;
		else if(result < 1) {
			System.out.println("알 수 없는 이유로 게시글이 삭제되지 않았습니다.");
		}
		else {
			System.out.println("★ 게시글이 삭제되었습니다.");
		}
	}
	
	
	/**
	 * 글 목록 전체 출력
	 * @param list
	 */
	public static void printAll(List<BoardDTO> list) {
		// 글 목록이 존재하는지 확인
		if(list == null || list.isEmpty()) {
			System.out.println("조회된 글이 없습니다.");
			return;
		}
		// 글 목록 출력
		for(BoardDTO dto : list) {
			printOne(dto);
		}
		
	}
	
	/**
	 * 게시글 1개 출력
	 * @param dto
	 */
	public static void printOne(BoardDTO dto) {
		
		if(dto == null) {
			System.out.println("조회할 수 없는 게시글입니다.");
			return;
		}
		// Quiz
		
		DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		System.out.println("========================================");
		System.out.println("★ 글 번호: " + dto.getNo());
		System.out.println("★ 제목: " + dto.getTitle());
		System.out.println("★ 작성자: " + dto.getWriter());
		System.out.println("----------------------------------------");
		System.out.println(" " + dto.getContent());
		System.out.println();
		System.out.println("★ 등록일: " + dto.getRegDate().format(formatter));
		System.out.println("★ 수정일: " + dto.getUpdDate().format(formatter));
		System.out.println("========================================");
		System.out.println();
	}
	
	/**
	 * 게시글 추가, 수정 시 입력 받는 메서드
	 * @return
	 */
	public static BoardDTO input() {
		
		System.out.print("제목 입력: ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("내용 입력: ");
		String content = sc.nextLine();
		
		// 객체 생성
		BoardDTO board = new BoardDTO();
		// 값 추가
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		
		return board;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
