package statics;

public class MyMath {
	//절대값 계산 메서드 정의
	public static int MyAbs(int x) {
		return (x < 0) ? -x : x;
	}
	
	//거듭제곱을 계산하는 메서드
	public static int MyPow(int x, int y) {
		int gob = 1;
		for (int i=1; i<=y; i++) {
			gob = gob * x;
		}
		return gob;
	}
	/*
	  2(x)의 3(y)제곱
	  i=1, 1<=3, 1*2
	  i=2, 2<=3, 2*2
	  i=3, 3<=3, 2*2*2
	 */

}
