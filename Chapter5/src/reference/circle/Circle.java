package reference.circle;

public class Circle {
	Point center; //Point 자료형 참조 - 중심점
	int radius;   //반지름
	final double PI = 3.1415; 
	
	//생성자
	public Circle(int x, int y, int radius) {
		center = new Point(x,y);
		this.radius = radius;
	}
	
	//원의 넓이 계산하는 메서드
	public double getArea() {
		double area = PI * radius * radius;
		return area;
	}
	
	//원의 정보 출력
	public void showCircleInfo() {
		System.out.println("원의 중심은 (" + center.getX() + ", " +
				center.getY() + ")이고, 반지름은 " + radius + "입니다.");
	}
	

}
