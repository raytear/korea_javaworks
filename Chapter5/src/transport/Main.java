package transport;

public class Main {

	public static void main(String[] args) {
		//Person객체 생성
		Person p1 = new Person("이정후", 10000);
		Person p2 = new Person("최민정", 20000);
		//Bus 객체 생성
		Bus bus100 = new Bus(100);
		//버스 요금
		int feeOfBus = 1500;
		
		//버스 타기
		p1.takeBus(bus100, feeOfBus);
		p2.takeBus(bus100, feeOfBus);
		
		//정보 출력
		p1.personInfo();
		p2.personInfo();
		bus100.busInfo();
		
	}

}
