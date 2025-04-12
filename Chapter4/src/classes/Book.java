package classes;

public class Book {
	private int bookNumber;   //책의 번호
	private String bookTitle; //책 제목
	private String author;    //작가
	
	//생성자
	public Book(int bookNumber, String bookTitle, String author) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	//책의 정보를 출력하는 메서드
	public void showBookInfo() {
		System.out.println(bookNumber + ": " + bookTitle + ", " + author);
	}

}
