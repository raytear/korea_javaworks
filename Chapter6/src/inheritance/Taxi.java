package inheritance;

public class Taxi extends Car{
	int passenger;
	
	Taxi(String brand, int year, int passenger){
		super(brand, year); //부모 멤버 상속
		this.passenger = passenger;
	}
	
	//[빈 바탕 > 우클릭 > Source > Override] 아래 문구 자동 출력
	@Override
	void carInfo() {
		super.carInfo(); //부모 메서드 상속
		System.out.println("승객수: " + passenger);
	}
	
	//부모 메서드 재정의(오버라이딩 - Overriding)
/*	@Override //@,어노테이션(annotation)
	void carInfo() {
		System.out.println("모델명: " + brand);
		System.out.println("연식: " + year);
		System.out.println("승객수: " + passenger);
	}
*/
	
}
