package threads.print_beep;

import java.awt.Toolkit;

//Runnable 인터페이스를 구현한 작업 스레드 구현 클래스 정의
public class BeepTask implements Runnable {

	@Override
	public void run() {
		// "띵" 소리 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			toolkit.beep();		//beep() - 소리 재생 메서드 호출
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
