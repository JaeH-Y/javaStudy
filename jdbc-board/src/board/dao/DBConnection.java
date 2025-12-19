package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConnection {
	public Connection conn;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	// JDBC 사용 전체 흐름 요약
	// 1. 드라이버 로딩
	// 2. Connection으로 DB 접속
	// 3. Statement 또는 PreparedStatement로 SQL 작성
	// 4. SQL 실행 후 ResultSet으로 결과 받기
	// 5. 모두 사용 후 close로 자원 정리
	
	public DBConnection() {
		// MySQL JDBC 드라이버 로드
		// com.mysql.jdbc.Driver는 구버전으로 현재는 사용 안함 -> com.mysql.cj.jdbc.Driver로 드라이버 사용
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!" );
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로딩 실패!" );
			e.printStackTrace();
		}
		
		// DB에 연결
		// jdbc:mysql://도메인:[PORT]/[스키마]?옵션파라미터
		String dbUrl = "jdbc:mysql://localhost:3306/jdbc_board";
		String dbUser = "root";
		String dbPw = "roqkf@12";
		
		// DriverManager
		// 자바 프로그램이 적절한 JDBC 드라이버를 통해 DB에 접속할 수 있도록 연결을 중개
		// 자바 프로그램 -> JDBC 드라이버 -> DB
		// getConnection() 메소드로 DB에 연결 요청하고 생성된 Connection 객체를 반환
		try{
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
			System.out.println("DB 연결 성공!");
		}
		catch (SQLException e) {
			System.err.println("DB 연결 실패!");
			e.printStackTrace();
		}
	}
	
	// DB 연결 테스트
//	public static void main(String[] args) {
//		DBConnection jdbc = new DBConnection();
//	}
	
	
	
	
	
	
	
	
	
	
}
