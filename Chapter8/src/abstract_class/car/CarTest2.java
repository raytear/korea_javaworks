package abstract_class.car;

public class CarTest2 {

	public static void main(String[] args) {
		//매개변수의 다형성
		System.out.println("===== 사람이 운전하는 자동차 =====");
		carRun(new HumanCar());
		
		System.out.println("===== 자율 주행하는 자동차 =====");
		carRun(new AICar());
	}
	
	public static void carRun(Car car) {
		car.run();
	}

}
