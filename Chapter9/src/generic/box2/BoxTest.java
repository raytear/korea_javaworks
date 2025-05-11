package generic.box2;

import generic.box.Car;

public class BoxTest {

	public static void main(String[] args) {
		//String type
		Box box1 = new Box();
		box1.set("Good Luck!!");
		//String이 Object보다 작으므로 형변환 필요함
		String msg = (String) box1.get();
		System.out.println(msg);
		
		//참조 자료형
		Box box2 = new Box();
		box2.set(new Car("EV4"));
		
		Car car = (Car) box2.get();
		System.out.println(car);
	}

}
