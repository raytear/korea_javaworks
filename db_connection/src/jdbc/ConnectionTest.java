package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		// 오라클 DBMS에 연결
		// 라이브러리가 import 되지 않으면, module.info 삭제
		Connection conn = null;
		
		try {
			//jdbc 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			//연결
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe",	//db url
				"system",								//사용자 계정
				"1234"									//사용자 패스워드
			);
			System.out.println(conn + "DB 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
