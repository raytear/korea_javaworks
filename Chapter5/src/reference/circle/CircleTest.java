package reference.circle;

public class CircleTest {

	public static void main(String[] args) {
		// Circle 객체 생성
		Circle c1 = new Circle(2, 3, 5);
		Circle c2 = new Circle(8, 8, 10);		
		
		System.out.println("============ 원의 정보 ============");
		c1.showCircleInfo();
		System.out.printf("원의 넓이: %.2f\n", c1.getArea());
		c2.showCircleInfo();
		System.out.printf("원의 넓이: %.2f\n", c2.getArea());

	}

}
