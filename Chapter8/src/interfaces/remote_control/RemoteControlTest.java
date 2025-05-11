package interfaces.remote_control;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 부모(인터페이스) 타입으로 객체 생성
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		// TV를 사용
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12); //최대 10으로 설정되도록 변경
		RemoteControl.changeBattery(); //static 메서드이므로 인터페이스 이름으로 직접 접근
		rcTV.setMute(true);
		rcTV.setMute(false);
		rcTV.turnOff();
		System.out.println("===================");

		// Audio 사용
		rcAudio.turnOn();
		rcAudio.setVolume(-1); //0
		rcAudio.turnOff();
		

	}

}
