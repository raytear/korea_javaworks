package classes;

//은행 계좌 클래스 정의
//private - 접근 제어자(내부 클래스만 접근 가능함)
public class BankAccount {
	public String ano;   //account number, 계좌 번호
	private String owner; //계좌주
	private int balance;  //잔고
	
	//기본 생성자
	public BankAccount() {}

}
