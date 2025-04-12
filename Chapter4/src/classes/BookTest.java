package classes;

public class BookTest {

	public static void main(String[] args) {
		// 객체 배열 생성
		/*
		   Book[] books = new Book[3];
		
		for(int i= 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
		
		//원소(요소) 추가(저장)
		books[0] = new Book(100, "채식주의자", "한강");
		books[1] = new Book(101, "자바 프로그래밍 입문", "박은종");
		books[2] = new Book(102, "모두의 파이썬", "이승찬");
		*/
		
		//객체 배열 생성 방법 2
		Book[] books = {
				new Book(100, "채식주의자", "한강"),
				new Book(101, "자바 프로그래밍 입문", "박은종"),
				new Book(102, "모두의 파이썬", "이승찬"),
		};
		
		//특정 원소 출력
		//books[0].showBookInfo();
		
		//전체 출력
		for(int i= 0; i < books.length; i++) {
			books[i].showBookInfo();
		}
	}

}
