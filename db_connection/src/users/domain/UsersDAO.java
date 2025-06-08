package users.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object)
// - 데이터베이스에 연결, 데이터를 생성, 조회, 수정, 삭제 등의 작업을 하는 클래스
public class UsersDAO {
	//DB에 연결
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
	
	//회원 생성
	public void insertUser(Users users) {
		//SQL - DML(삽입 구문)
		//? - 칼럼값을 칼럼명에 바인딩 시킴
		//Connection(db 연결), PreparedStatement(sql 작업) 객체 생성
		String sql = "INSERT INTO users(userid, userpassword, username, userage) "
				+ "VALUES(?, ?, ?, ?)";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, users.getUserId()); 		 //메인에서 입력된 아이디
			pstmt.setString(2, users.getUserPassword()); 
			pstmt.setString(3, users.getUserName());	 
			pstmt.setInt(4, users.getUserAge());
			
			pstmt.execute(); //sql 실행(커밋과 같은 역할)
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//회원 목록 보기
	public List<Users> getUserList(){
		String sql = "SELECT * FROM users";
		
		List<Users> userList = new ArrayList<>();
		
		//결과 데이터를 가져올 객체 생성 - ResultSet 클래스 사용
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()){
				
			while(rs.next()) {//검색된 자료가 있는 동안 계속
				Users user = new Users();
				
				user.setUserId(rs.getString("userid")); //db에서 검색한 칼럼값(아이디)를 설정
				user.setUserPassword(rs.getString("userpassword")); //비밀번호
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				userList.add(user); //리스트에 user 객체 저장
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return userList; //userList 반환해 줌
	}
	
	//회원 상세 보기(1건 보기)
	public Users getUser(String userId) {
		String sql = "SELECT * FROM users WHERE userid = ?";
		Users user = new Users(); //검색 결과를 보여줄 user 객체
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, userId);
			
			try(ResultSet rs = pstmt.executeQuery()){ //검색된 자료 객체 생성
				if(rs.next()) { //검색된 자료가 있으면
					user.setUserId(rs.getString("userid"));
					user.setUserPassword(rs.getString("userpassword"));
					user.setUserName(rs.getString("username"));
					user.setUserAge(rs.getInt("userage"));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	//회원 수정
	public void updateUser(Users user) {
		String sql = "UPDATE users SET userpassword = ?, username = ?, userage = ?"
				+ "WHERE userid = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, user.getUserPassword());
			pstmt.setString(2, user.getUserName());
			pstmt.setInt(3, user.getUserAge());
			pstmt.setString(4, user.getUserId());
			
			pstmt.execute(); //sql 실행
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	//회원 삭제
	public void deleteUser(String userId) {
		String sql = "DELETE FROM users WHERE userId = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, userId);
						
			pstmt.execute(); //sql 실행
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
