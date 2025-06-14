package interface_impl;

public class MyMathTest {

	public static void main(String[] args) {
		MyMathImpl math = new MyMathImpl();
		
		int value = math.myAbs(-10);
		System.out.println("절대값: " + value);
	}

}
