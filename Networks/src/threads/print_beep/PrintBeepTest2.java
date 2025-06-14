package threads.print_beep;

public class PrintBeepTest2 {

	public static void main(String[] args) {
		//메인 스레드와 작업 스레드(소리 재생)가 동시에 실행
		//자동 형변환(인터페이스 형으로 객체 생성)
		Runnable beepTask = new BeepTask();
		//작업 스레드 객체 생성
		Thread thread = new Thread(beepTask);
		thread.start(); //작업 스레드 시작
		
		// "띵" 문자 5번 출력하기
		//메인 스레드 실행
		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			//시간 대기 메서드 - Thread.sleep(1000) - 1초
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
