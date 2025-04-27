package wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		// Wrapper 클래스 - 기본 자료형을 클래스형으로 만든 클래스
		// 자료형의 크기 확인
		System.out.printf("byte형의 크기 => %dbit\n", Byte.SIZE);
		System.out.printf("int형의 크기 => %dbit\n", Integer.SIZE);
		System.out.printf("long형의 크기 => %dbit\n", Long.SIZE);
		System.out.printf("double형의 크기 => %dbit\n", Double.SIZE);
		
		//Integer 클래스
		//int < Integer (자동형변환)
		Integer num1 = 100;
		int num2 = 200;
		int sum; //합계
		
		//intValue() → Integer형을 int형으로 변환
		sum = num1.intValue() + num2; //타입을 동일하게 맞춤
		System.out.println(sum);
		
		//valueOf() → 정수나 문자열을 Integer 클래스로 변환
		Integer n1 = Integer.valueOf("100");
		System.out.println(n1);
		
		//parseInt() → 매개로 전달된 문자열을 정수로 변환
		int n2 = Integer.parseInt("200");
		System.out.println(n2);
		
		//parseDouble() → 매개로 전달된 문자열을 실수로 변환
		double dNum = Double.parseDouble("1.609");
		System.out.println(dNum);
	}

}
