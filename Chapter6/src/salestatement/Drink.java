package salestatement;

public class Drink {
	//protected는 상속받는 클래스에서만 접근 가능
	protected String name;  //상품명
	protected int price;    //가격
	protected int quantity; //수량
	
	//생성자
	public Drink(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//금액 계산 : 가격 x 수량
	public int calcPrice() {
		return price * quantity;
	}
	
	static void printTitle() { //제목행 출력
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	void printData() { //데이터 출력
		System.out.println(name + "\t" + price +  
				 "\t" + quantity + "\t" + calcPrice());
		
	}
}
