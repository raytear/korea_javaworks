package collection.stack;

//스택에 저장할 코인 클래스 정의(참조 자료형)
public class Coin {
	
	private int value; //금액
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
