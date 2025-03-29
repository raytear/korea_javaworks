package hello;

public class PrintData {

	public static void main(String[] args) {
		// 데이터 - 숫자(정수, 실수), 문자
		// 숫자
		System.out.println(100); //정수
		System.out.println(3.3); //실수
		
		// 문자
		System.out.println('A'); //1개의 문자 - 홑따옴표 사용
		System.out.println('가');
		System.out.println("apple"); //여러개의 문자(문자열) - 쌍따옴표 사용
		
		// 연산
		System.out.println(4 + 5);
		System.out.println(4 - 5);
		System.out.println(4 * 5);
		System.out.println(4.0 / 5.0);
		
		// 불리언(Boolean) - 결과가 참(true)/거짓(false)으로 되는 자료형
		System.out.println(4 > 5); //false
		System.out.println(true);
	}

}
