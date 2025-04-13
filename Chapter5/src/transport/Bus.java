package transport;

public class Bus {
	private int busNumber; //버스 번호
	private int passenger; //승객 수
	private int money;     //버스의 수입
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태우는 메서드
	public void take(int money) {
		this.money += money; //this.money = this.money + money
		passenger++; //승객 수 1 증가
	}
	
	//버스의 정보를 출력하는 메서드
	public void busInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money + 
				"원이고, 승객 수는 " + passenger + "명 입니다.");
	}

}
