package list;

import java.util.ArrayList;

class Shape{
	public void draw() {
		System.out.println("도형");
	}
}
	
class Circle extends Shape{
	public void draw() {
		System.out.println("원");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		//List 타입으로 Shape 객체를 저장할 ArrayList 생성
		ArrayList<Shape> list = new ArrayList<>(); 
		
		//자료 저장 - 다형성을 이용한 객체 생성
		list.add(new Shape());
		list.add(new Circle());
		list.add(new Triangle());
		
		//출력
		for(Shape s : list)
			s.draw();
		
		//인덱스로 출력
		for(int i = 0; i < list.size(); i++) {
			Shape s = list.get(i);
			s.draw();
		}
	

	}

}
