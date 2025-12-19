package board.service;

import java.util.List;

import board.dto.BoardDTO;

/**
 * 게시판 프로그램의 기능 정의
 * - 게시글 목록
 * - 게시글 조회
 * - 게시글 등록
 * - 게시글 수정
 * - 게시글 삭제
 * 
 * => 추상 메소드로 정의
*/
public interface BoardService {

	// 게시글 목록
	// 전체 게시글 목록을 List에 담아 반환
	List<BoardDTO> list();
	
	// 게시글 조회
	// 조회할 게시글 번호를 전달
	// 조회된 게시글 객체를 반환
	BoardDTO select(int no);
	
	// 게시글 등록
	// 등록할 게시글 객체를 전달
	// 등록된 게시글 개수를 반환
	int insert(BoardDTO board);
	
	
	// 게시글 수정
	// 수정할 게시글 객체를 전달
	// 수정된 게시글 개수를 반환
	int update(int no, BoardDTO board, boolean isCheck);

	
	// 게시글 삭제
	// 삭제할 게시글 번호를 전달
	// 삭제된 게시글 개수를 반환
	int delete(int no, boolean isCheck, String writer);
	
	
	
	
	
	
	
	
}
