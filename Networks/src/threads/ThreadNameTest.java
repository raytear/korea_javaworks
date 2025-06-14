package threads;

public class ThreadNameTest {

	public static void main(String[] args) {
		
		//메인 스레드 생성
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		//작업 스레드 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println("threadA 이름: " + getName() + " 실행");
			}
		};
		threadA.start(); //스레드 시작 함수 호출
		
		//작업 스레드 이름 변경 - setName()
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println("chatThread 이름: " + getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread"); //스레드 이름 변경
		chatThread.start();
			
	}

}
