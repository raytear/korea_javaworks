package interfaces.calculator;

public interface Calculator {
	//인터페이스 자료형에서는 선언된 변수는 상수로 변환됨(final이 붙은 것과 같음)
	int ERROR = -99999;
	
	//모든 메서드가 추상메서드이다.
	//정수형 계산기 구현 - 더하기, 빼기, 곱하기, 나누기
	//선언부만 있는 구현 블럭은 없음
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
}
