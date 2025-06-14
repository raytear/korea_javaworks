package lambda;

//@FunctionalInterface - 함수형 인터페이스임을 알려줌으로써 추상메서드를 1개만 쓰도록 함
@FunctionalInterface
public interface MyMath {
	int myAbs(int n); //절대값 계산 메서드
	
	//int add(int x, int y);
}
