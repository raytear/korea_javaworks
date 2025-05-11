package interfaces.scheduler;

public interface Scheduler {
	//2가지 업무(기능)
	//다음 전화 가져오기
	public void getNextCall();
	
	//상담원에게 전화 배분하기
	public void sendCallToAgent();

}
