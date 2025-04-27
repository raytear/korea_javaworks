package exceptions;

public class ExceptionHandling1 {
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		// 예외 발생 - 실행 에러(Runtime error)
		System.out.println("[프로그램 시작]\n");
		try { //예외가 발생할 수 있는 곳을 try~catch로 감싼다.
		printLength("Hello");
		printLength(null);
		}catch(NullPointerException e) {//예외 처리 메세지 입력하는 곳
			//NullPointerException 대신 부모인 Exception 사용 가능
			System.out.println(e.getMessage());
		}
			
		System.out.println("[프로그램 종료]");

	}
}
