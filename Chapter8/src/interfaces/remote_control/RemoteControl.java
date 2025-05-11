package interfaces.remote_control;

public interface RemoteControl {
	//인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	//디폴트 메서드 - 실체 메서드에 default 키워드를 붙임
	default void setMute(boolean mute) {
		if(mute) { //mute == True
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}

}
