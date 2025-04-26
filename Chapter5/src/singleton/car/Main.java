package singleton.car;

public class Main {

	public static void main(String[] args) {
		//자동차 공장 객체 생성
		CarFactory factory = CarFactory.getInstance();
		
		// 자동차 공장에서 자동차 생성
		Car sonata1 = factory.createCar();
		Car sonata2 = factory.createCar();
		Car sonata3 = factory.createCar();
		
		System.out.println("소나타 번호: " + sonata1.getCarNumber());
		System.out.println("소나타 번호: " + sonata2.getCarNumber());
		System.out.println("소나타 번호: " + sonata3.getCarNumber());

	}

}
