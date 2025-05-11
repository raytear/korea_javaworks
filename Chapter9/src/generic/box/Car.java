package generic.box;

public class Car {
	//default 멤버변수
	//같은 패키지에서는 접근하고, 다른 패키지에서 접근할 수 없음
	String name; //모델명
	
	//생성자
	public Car(String name){
		this.name = name;
	}
	
	//객체의 문자열 정보 반환
	@Override
	public String toString() {
		return name;
	}	
}
