package singleton.car;

public class CarFactory {
	//싱글톤 패턴으로 CarFactory 클래스 작성
	private static CarFactory instance;
	
	//생성자 접근 제어 - private
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		//공장은 1개만 생성됨
		if(instance == null)
			instance = new CarFactory();
		return instance; //객체 반환
	}
	
	//자동차 생성 메서드 정의
	public Car createCar() {
		//자동차는 여러 개 생성 가능
		Car car = new Car();
		return car;
	}		

}
