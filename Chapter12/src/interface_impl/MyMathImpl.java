package interface_impl;

public class MyMathImpl implements MyMath{

	//기본 생성자
	public MyMathImpl() {}
	
	@Override
	public int myAbs(int n) {
		if(n < 0) {
			return -n;
		}else {
			return n;
		}
	}
}
