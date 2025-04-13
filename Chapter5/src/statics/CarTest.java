package statics;

public class CarTest {

	public static void main(String[] args) {
		//Car 객체 생성
		//차량 번호 자동 부여
		Car car1 = new Car();		
		System.out.println(car1.getCarNumber());

		Car car2 = new Car();		
		System.out.println(car2.getCarNumber());

		Car car3 = new Car();		
		System.out.println(car3.getCarNumber());
	}

}
