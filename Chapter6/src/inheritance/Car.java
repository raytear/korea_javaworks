package inheritance;

public class Car {
	String brand;
	int year;
	
	//매개변수가 있는 생성자
	Car(String brand, int year){
		this.brand = brand;
		this.year = year;
	}
	
	//차의 정보 출력 메서드
	void carInfo() {
		System.out.println("모델명: " + brand);
		System.out.println("연식: " + year);
	}

}
