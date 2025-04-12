package constant;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 - 변하지 않는 값을 저장(변수의 반대말)
		// final 키워드 사용, 대문자(관례적) 사용
		final int MIN_NUM = 0; //정수형 상수 선언
		final int MAX_NUM = 100;
		
		//MIN_NUM = 1; //변경 불가
		
		//원주율 - 파이(상수)
		final double PI = 3.1415;
		int radius = 5; //반지름
		double area;    //원의 넓이를 저장할 변수
		
		//연산
		area = PI * radius * radius;
		
		System.out.println(PI);
		System.out.printf("원의 넓이: %.2f\n", area);
		

	}

}
