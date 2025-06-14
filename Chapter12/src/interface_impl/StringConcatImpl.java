package interface_impl;

//StringConcat 구현한 클래스 정의
public class StringConcatImpl implements StringConcat {

	//기본 생성자 생략
	
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);		
	}

}
