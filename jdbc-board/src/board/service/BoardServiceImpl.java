package board.service;

import java.util.List;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

/**
 * 게시판 기능 구현
 * 실제 비즈니스 로직(핵심 로직)을 작성
 * 
*/
public class BoardServiceImpl implements BoardService{
	
	// 호출하면 부모 클래스 생성되면서 DB 자동 연결 시도함
	private BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public List<BoardDTO> list() {
		
		// DAO로 게시글 목록을 요청하고 그 결과로 List<BoardDTO>를 받아옴
		// 게시글 목록 요청하는 SQL명령어는 DAO에 하드코딩 돼있음
		// 추가 가공 필요 시 변수에 넣고 가공
		List<BoardDTO> boardList = boardDAO.list();
		
		// 가공 로직 작성
		
		return boardList;
	}

	@Override
	public BoardDTO select(int no) {
		BoardDTO board = boardDAO.select(no);
		
		return board;
	}

	@Override
	public int insert(BoardDTO board) {
		int result = boardDAO.insert(board);
		
		if(result > 0) {
			System.out.println("데이터 등록 성공!");
		}
		else {
			System.out.println("데이터 등록 실패!");
		}
		
		return result;
	}

	@Override
	public int update(int no, BoardDTO board, boolean isCheck) {
		int resultRows = 0;
		if(isCheck) resultRows = boardDAO.checkUpdate(no, board);
		else resultRows = boardDAO.update(no, board);
		
		if(resultRows > 0) System.out.println("데이터 수정 성공!");
		return resultRows;
	}

	@Override
	public int delete(int no, boolean isCheck, String writer) {
		int resultRows = 0;
		
		if(isCheck) resultRows = boardDAO.checkDelete(no, writer);
		else resultRows = boardDAO.delete(no);
		
		return resultRows;
	}
	
	
	
}
