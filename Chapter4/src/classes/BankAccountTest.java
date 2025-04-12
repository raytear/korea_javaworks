package classes;

public class BankAccountTest {

	public static void main(String[] args) {
		// BankAccount 객체 생성
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("222-333", "최금리", 20000);		
		
		//account1.ano = "1111";
		account1.setAno("111-222");
		account1.setOwner("나저축");
		account1.setBalance(10000);
				
		//계좌 정보 출력
/*		//account1의 정보
		System.out.println("계좌번호: " + account1.getAno());
		System.out.println("계좌주: " + account1.getOwner());
		System.out.println("잔고: " + account1.getBalance());
		
		//account2의 정보
		System.out.println("계좌번호: " + account2.getAno());
		System.out.println("계좌주: " + account2.getOwner());
		System.out.println("잔고: " + account2.getBalance());
*/
		
		//메서드 생성 후 더 간단히 코드 작성 가능(위 주석은 메서드 생성 전.참고)
		//account1의 정보
		account1.displayInfo();
		
		//account2의 정보
		account2.displayInfo();
	}

}
