package classes;

public class Book {
	private int bookNumber;   //책의 번호
	private String bookTitle; //책 제목
	private String author;    //작가
	
	//기본 생성자
	public Book() {}
	
	//생성자
	public Book(int bookNumber, String bookTitle, String author) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	//설정자 메서드(setter)
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setAuthor(String author) {
		this.author = author;
	}			
	
	//접근자 메서드(getter)
	public int getBookNumber() {
		return bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthor() {
		return author;
	}
		
	//책의 정보를 출력하는 메서드
	public void showBookInfo() {
		System.out.println(bookNumber + ": " + bookTitle + ", " + author);
	}

}
