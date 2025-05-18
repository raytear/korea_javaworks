package interfaces.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// 부모 타입으로 객체 생성
		Queue shelfQueue = new BookShelf();
		
		//요소 넣기
		shelfQueue.enQueue("혼공 Java");
		shelfQueue.enQueue("채식주의자");
		
		//요소의 수
		System.out.println("요소의 총 개수: " + shelfQueue.getSize());
		
		//요소 꺼내기
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		

	}

}
