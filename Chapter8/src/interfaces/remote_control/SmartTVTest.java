package interfaces.remote_control;

public class SmartTVTest {

	public static void main(String[] args) {
		
		SmartTV tv = new SmartTV();
		
		//구현된 객체(tv)를 인터페이스 타입(부모)에 대입(자동형변환)		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		rc.setVolume(9);
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();

		RemoteControl.changeBattery();

	}

}
