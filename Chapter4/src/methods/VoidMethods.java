package methods;

public class VoidMethods {
	
	//인사하는 기능의 함수를 정의
	public static void sayHello() {
		System.out.println("안녕하세요~");
	}
	
	public static void sayHello(String name) {
		System.out.println(name + "님 안녕하세요~");
	}
	
	//main() 함수
	public static void main(String[] args) {
		// 반환형(void)이 없는 함수
		sayHello(); //함수 호출
		sayHello("정후"); //String name = "정후";
		sayHello("민정");
	}

}
