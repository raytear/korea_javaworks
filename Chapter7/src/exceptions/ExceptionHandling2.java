package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// 클래스의 이름을 잘못 입력한 경우 예외
		// 컴파일러가 예외를 알려주는 것 - 컴파일 에러
		try {
			Class.forName("java.lang.String2");
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
//			e.printStackTrace(); //빨간 글씨로 나와도 에러 아님
		}finally { //항상 수행되어야 하는 영역을 설정할 때 사용함
			System.out.println("항상 수행됨");
		}
	}

}
