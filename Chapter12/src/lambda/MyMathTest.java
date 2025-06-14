package lambda;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath math;
		
		//람다식 - 이름 없는 익명함수, 한 줄일때 중괄호 생략
		math = (x) -> (x < 0) ? -x : x;
		System.out.println("절대값: " + math.myAbs(-10));
		
	}
}
