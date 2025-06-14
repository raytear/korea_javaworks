package interface_impl;

public class StringConcatTest {

	public static void main(String[] args) {
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString("Hill", "State");
		concat.makeString("자바", "코딩");
	}

}
