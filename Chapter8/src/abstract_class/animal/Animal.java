package abstract_class.animal;

public abstract class Animal {
	String kind;
		
	void breathe() {
		System.out.println("동물은 숨을 쉽니다.");
	}
	
	public abstract void cry(); //선언만 할 수 있음

}
