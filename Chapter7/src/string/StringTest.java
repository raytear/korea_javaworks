package string;

public class StringTest {

	public static void main(String[] args) {
		// String 객체 생성
		String name1 = "이정후";
		String name2 = "이정후";
		String name3 = new String("이정후");
		String name4 = new String("이정후");
		
		System.out.println(name1);
		System.out.println(name2);
		
		//문자열이 같은지 확인
		System.out.println(name1.equals(name2));
		System.out.println(name3.equals(name4));
		
		//메모리 주소값이 같은지 확인
		System.out.println(name1 == name2); //상수값은 같은 주소 사용
		System.out.println(name3 == name4); //인스턴스 객체는 다른 주소임

	}

}
