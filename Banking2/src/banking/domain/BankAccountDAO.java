package banking.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankAccountDAO {
	static {
		try {
			//클래스 로딩시 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/xe"; //db 경로
	static String username = "javauser"; //사용자 계정
	static String password = "pwjava"; //사용자 비밀번호
	
	//계좌 생성
	public void createAccount(BankAccount account) {
		String sql = "INSERT INTO bank_account VALUES (?, ?, ?)";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, account.getAno());
			pstmt.setString(2, account.getOwner());
			pstmt.setInt(3, account.getBalance());
			
			pstmt.execute(); //sql 실행			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//계좌 목록
	public List<BankAccount> getAccountList(){
		String sql = "SELECT * FROM bank_account";
		List<BankAccount> accountList = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()){
			
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				//새 계좌 생성
				BankAccount Account = new BankAccount(ano, owner, balance);
				accountList.add(Account); //account 객체를 리스트에 저장
			}
						
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return accountList; //리스트를 호출한 곳에 반환
	}
	
	//계좌 검색(계좌 상세보기)
	public BankAccount findAccount(String ano) {
		String sql = "SELECT * FROM bank_account WHERE ano = ?";
		
		BankAccount account = null;
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, ano);
			
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					ano = rs.getString("ano"); //db에 객체의 계좌번호 가져옴
					String owner = rs.getString("owner"); //계좌주 가져옴
					int balance = rs.getInt("balance");	  //잔고 가져옴
					account = new BankAccount(ano, owner, balance);
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return account; //1개의 계정 반환
	}
	
	//예금 - 계좌 수정
	public void deposit(String ano, int money) { //계좌번호, 입금액
		//이미 등록된 계좌 가져오기
		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() + money; //잔액 + 입금액
		
		String sql = "UPDATE bank_account SET owner = ?, balance = ? "
				+ "WHERE ano = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			
			pstmt.execute(); //sql 실행			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}
	
	//출금 - 계좌 수정
	public void withdraw(String ano, int money) { //계좌번호, 출금액
		//이미 등록된 계좌 가져오기
		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() - money; //잔액 - 출금액
		
		String sql = "UPDATE bank_account SET owner = ?, balance = ? "
				+ "WHERE ano = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			
			pstmt.execute(); //sql 실행			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}
}
