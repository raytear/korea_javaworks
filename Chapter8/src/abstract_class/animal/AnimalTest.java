package abstract_class.animal;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat의 객체 생성
		// 부모 타입으로 객체 생성 - 다형성
		Animal cat = new Cat();
		cat.breathe();
		cat.cry();
		
		Animal dog = new Dog();
		dog.breathe();
		dog.cry();

	}

}
