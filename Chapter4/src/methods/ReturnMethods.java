package methods;

public class ReturnMethods {
	
	//main() - 프로그램을 실행하는 함수
	public static void main(String[] args) {
		
		int value = square(8); //square()함수 호출
		double value2 = add(3.3, 2.54); //add() 함수 호출
		String msg = message(); //message() 호출
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(msg);

	}
	
	//제곱수를 계산하는 함수 - 매개변수(parameter)가 1개
	public static int square(int x) { //int x = 8
		return x * x; //함수를 호출한 곳으로 값을 보내줌
	}
	
	//두 실수를 더하는 함수 - 매개변수(파라미터)가 2개
	public static double add(double x, double y) {
		return x + y;
	}
	
	//메시지를 출력하는 함수
	public static String message() {
		return "생일 축하해요!";
	}

}
