package interfaces.remote_control;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 부모(인터페이스) 타입으로 객체 생성
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12); //최대 10으로 설정되도록 변경
		rcTV.turnOff();

	}

}
