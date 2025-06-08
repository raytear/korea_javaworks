package banking.run;

import java.util.List;
import java.util.Scanner;

import banking.domain.BankAccount;
import banking.domain.BankAccountDAO;

public class BankingMain {
	//BankAccountDAO의 객체 생성
	static BankAccountDAO accountDAO = new BankAccountDAO();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true; //실행과 종료 상태 변수
		while(sw) {
			System.out.println("=========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("=========================================");
			System.out.print("선택> ");
			
			int selectNum = Integer.parseInt(scan.nextLine());
			
			switch(selectNum) {
			case 1:
				createAccount();
				break;
			case 2:
				getAccountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sw = false;
				break;
			default:
					System.out.println("지원되지 않는 기능입니다. 다시 입력하세요.");
					break;
			}
		} //while 닫기
		scan.close();

	}//main() 닫기
	
	// 계좌 목록
	private static void getAccountList() {
		System.out.println("=========================================");
		System.out.println("                계 좌 목 록                ");
		System.out.println("=========================================");
		
		//accountList 가져오기
		List<banking.domain.BankAccount> accountList = accountDAO.getAccountList();
		for(int i = 0; i <accountList.size(); i++) {
			BankAccount account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.println("잔고: " + account.getBalance());
		}
	}
	// 계좌 생성	
	private static void createAccount() {
		System.out.println("=========================================");
		System.out.println("                계 좌 생 성                ");
		System.out.println("=========================================");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scan.nextLine(); //계좌 입력
			
			if(accountDAO.findAccount(ano) != null) { //계좌가 이미 저장되어 있다면
				System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요.");
			}else { //계죄가 없다면
				System.out.print("계좌주: ");
				String owner = scan.nextLine();
				
				System.out.print("초기 입금액: ");
				int balance = Integer.parseInt(scan.nextLine());
				
				//신규 계좌 생성
				BankAccount newAccount = new BankAccount(ano, owner, balance);
				accountDAO.createAccount(newAccount); //dao의 메서드 호출
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; //정상 처리되면 반복문 종료함
			}			
		}//while 닫기	
	}//createAccount() 닫기
	
	// 예금
	private static void deposit() {
		System.out.println("=========================================");
		System.out.println("                예      금                ");
		System.out.println("=========================================");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine(); //계좌 입력
		
		System.out.println("입금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		
		if(accountDAO.findAccount(ano) != null) { //일치되는 계좌번호가 있으면
			//accountDAO의 deposit() 메서드 호출
			accountDAO.deposit(ano, amount);
			BankAccount account = accountDAO.findAccount(ano); //입금후 계좌 가져오기
			System.out.println("결과: 정상 입금 되었습니다. 현재 잔액: " + account.getBalance());

		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
		
	}
	// 출금
	private static void withdraw() {
		System.out.println("=========================================");
		System.out.println("                출      금                ");
		System.out.println("=========================================");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine(); //계좌 입력
		
		if(accountDAO.findAccount(ano) != null) { //일치되는 계좌번호가 있으면			
			while(true) {
				System.out.println("출금액: ");
				int amount = Integer.parseInt(scan.nextLine());
				//출금 = 잔고 - 출금액
				accountDAO.withdraw(ano, amount);
				BankAccount account = accountDAO.findAccount(ano); //출금된 계좌 가져옴
				if(amount > account.getBalance()) {
					System.out.println("잔액이 부족합니다. 다시 입력하세요.");
				}else {
 					System.out.println("결과: 정상 출금 되었습니다. 현재 잔액: " + account.getBalance());
					break; //while문 빠져나옴
				}
			}
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
		
	}
}//Main() 클래스 닫기