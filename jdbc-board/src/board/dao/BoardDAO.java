package board.dao;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import board.dto.BoardDTO;

/*
 * 데이터 접근 객체
 * 데이터베이스에 접근하는 로직들을 작성
 * 여기서는 게시글 데이터에 접근
 * 
*/
public class BoardDAO extends DBConnection{
	
	/**
	 * 게시글 목록	
	*/	
	
	public List<BoardDTO> list(){
		// 게시글 목록을 담을 컬렉션 객체 생성
		List<BoardDTO> boardList = new ArrayList<>();
		
		// SQL 작성
		// 최근 작성글부터 보여지도록 조회
		String sql = "SELECT * FROM board ORDER BY reg_date DESC";
		
		try {
			// 1. SQL 실행 객체 생성 - Statement(stmt)
			stmt = conn.createStatement();
			
			// 2. SQL 실행 요청 -> ResultSet(rs) 반환(SQL 실행 결과가 여기에 담김)
			rs = stmt.executeQuery(sql);
			
			// 3. 조회된 결과를 리스트(boardList)에 추가하기
			while (rs.next()) {	// 조회된 결과의 다음 행으로 이동 -> 더이상 이동할 값이 없으면 false 리턴
				BoardDTO dto = new BoardDTO();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명"): 해당 컬럼의 데이터를 반환
				dto.setNo(rs.getInt("no"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
				dto.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
				
				// 게시글 목록 추가
				boardList.add(dto);
				
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 - 예외 발생");
			e.printStackTrace();
		}
		
		// 4. 게시글 목록 반환
		return boardList;
	}
	
	/**
	 * 게시글 조회
	 * @param no
	 * @return BoardDTO
	 */
	public BoardDTO select(int no) {
		// 데이터 담을 객체 생성
		BoardDTO dto = new BoardDTO();
		// SQL 작성
		String sql = "SELECT * FROM board WHERE no = ?;";	// no가 ?인 데이터만 조회
		
		// 조회 프로세스: SQL 실행 객체 생성 -> SQL 실행 요청 -> 조회 결과 BoardDTO에 삽입 -> 리턴
		
		try {
			// 1. SQL 실행 객체 생성 - prepareStatement(pstmt)
			pstmt = conn.prepareStatement(sql);
			
			// no 매개변수의 값을 '?' 파라미터에 동적으로 바인딩
			// pstmt.setXXX(물음표 순서 번호, 매핑할 값);
			pstmt.setInt(1, no);	// 첫 번째 ?에 정수 no를 넣음
			
			// 2. SQL 실행 요청 -> 반환 결과: ResultSet(rs)
			rs = pstmt.executeQuery();
			
			// 3. 조회된 결과를 BoardDTO에 삽입
			if(rs.next()) {
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명"): 해당 컬럼의 데이터를 반환
				dto.setNo(rs.getInt("no"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setRegDate(rs.getObject("reg_date", LocalDateTime.class));
				dto.setUpdDate(rs.getObject("upd_date", LocalDateTime.class));
			}
			else {
				// 조회된 게시글이 존재하지 않는 경우
				System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
				return null;
			}
			
			
		} catch (SQLException e) {
			System.out.println("게시글 조회 - 예외 발생");
			e.printStackTrace();
		}
		// 4. 게시글 정보 1건 반환
		return dto;
	}
	
	/**
	 * 게시글 등록
	 * @param board
	 * @return
	 */
	public int insert(BoardDTO board) {
		
		int result = 0;
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		System.out.println("title: " + title);
		System.out.println("writer: " + writer);
		System.out.println("content: " + content);
		
		String sql = "INSERT INTO board(title, writer, content) VALUES(?,?,?);";
		
		try {
			// 동적 바인딩 Statement에 값 부여
			pstmt = conn.prepareStatement(sql);
			
			// ?에 값 넣기
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.setString(3, content);
			
			// which must be an SQL Data Manipulation Language (DML) statement,
			// such as INSERT, UPDATE or DELETE;
			// or an SQL statement that returns nothing, such as a DDL statement.
			// SQL(INSERT, UPDATE, DELETE)실행 시 영향을 받은 행의 갯수를 반환
			// 예: 게시글 1개 추가(행 1개 추가)
			// 성공 -> result = 1
			// 실패 -> result = 0
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.err.println("게시글 등록 중 예외 발생!");
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int checkUpdate(int no, BoardDTO board) {
		
		BoardDTO already = select(no);
		if(!already.getWriter().equals(board.getWriter())) {
			System.err.println("기존 게시글의 작성자가 아닙니다.");
			return -1;
		}
		
		int resultRows = update(no, board);
		
		return resultRows;
	}
	public int update(int no, BoardDTO board) {
		
		int resultRows = 0;
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		
		String sql = "UPDATE board SET title = ?, writer = ?, content = ? WHERE no = ? ";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.setString(3, content);
			pstmt.setInt(4, no);
			
			resultRows = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("게시글 업데이트 중 예외 발생!!");
			e.printStackTrace();
		}
		
		return resultRows;
	}
	
	public int checkDelete(int no, String writer) {
		
		int resultRows = 0;
		BoardDTO board = select(no);
		String already = board.getWriter();
		
		if(!writer.equals(already)) {
			System.out.println("기존 게시글의 작성자가 아닙니다. \n삭제를 취소합니다.");
			return -1;
		}
		resultRows = delete(no);
		return resultRows;
	}
	
	public int delete(int no) {
		
		int resultRows = 0;
		
		String sql = "DELETE FROM board WHERE no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			resultRows = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("DELETE 실행 중 에러 발생! \n테이블을 확인하세요!");
			e.printStackTrace();
		}
		
		return resultRows;
	}
	
	
	
	
	
	
	
	
	
	
}
