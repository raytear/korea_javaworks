package abstract_class.car;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자동차가 자율 주행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
		
	}
	
	//final이 붙은 메서드는 상속받을 수 없음
	/*
	@Override
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		System.out.println("수정");
	}
	*/
}
