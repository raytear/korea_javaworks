package polymorphism.downcasting;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
//		Animal human = new Human();
//		human.move();
		
		//readBook()에 접근 안됨 - 다운 캐스팅(강제 타입 변환) 필요함
		Animal animal = new Human();
		
		if(animal instanceof Human) {	 //animal이 Human의 인스턴스라면
			Human human = (Human)animal; //Human으로 강제 타입 변환
			human.move();
			human.readBook();
		}

	}

}
