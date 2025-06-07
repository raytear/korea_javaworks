package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest2 {
	//static{} - 정적(전역) 영역 초기화 블럭
	//매번 연결시마다 드라이버를 로드할 필요가 없음
	static {
		try {
			//클래스 로딩시 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/xe"; //db 경로
	static String username = "system"; //사용자 계정
	static String password = "1234"; //사용자 비밀번호
	
	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println("DB 연결 성공" + conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
