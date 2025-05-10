package abstract_class.car;

public class HumanCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 차를 운전합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크로 정지합니다.");
		
	}
	

}
