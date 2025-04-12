package thissample;

//public class로 하면 파일 이름이 되므로, public은 쓰면 안됨
//private을 생략하면 default로 public과 유사
class BirthDay{
	//default int year;
	int year;
	int month;
	int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	// this를 출력하는 메서드 정의
	public void printThis() {
		System.out.println(this);
	}
}

public class BirthDayTest {

	public static void main(String[] args) {
		// BirthDay 객체 생성
		BirthDay bDay = new BirthDay();
		bDay.setYear(2020);
		
		System.out.println(bDay); //객체 출력
		bDay.printThis();		
	}

}
