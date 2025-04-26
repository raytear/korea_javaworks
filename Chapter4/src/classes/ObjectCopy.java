package classes;

//객체의 얕은 복사(Shallow Copy)
public class ObjectCopy {

	public static void main(String[] args) {
		//Book 객체 생성
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//객체 추가
		array1[0] = new Book(100, "채식주의자", "한강");
		array1[1] = new Book(101, "자바 프로그래밍 입문", "백은종");
		array1[2] = new Book(102, "모두의 파이썬", "이승찬");
		
		//객체 수정 - array1의 첫번째 요소
		array1[0].setBookTitle("미생1");
		array1[0].setAuthor("윤태호");
		
		//향상된 for(클래스 이름 변수 이름 : 배열 이름){변수 출력}
		System.out.println("***** array1 출력 *****");
		for(Book book : array1)
			book.showBookInfo();
		
		//array1을 array2에 복사
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];
		}
		
		System.out.println("***** array2 출력 *****");
		for(Book book : array2)
			book.showBookInfo();

	}

}
