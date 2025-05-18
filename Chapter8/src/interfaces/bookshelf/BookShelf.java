package interfaces.bookshelf;

//Shelf를 상속하고 Queue를 구현한 BookShelf 클래스 정의
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		//예외 처리
		int len = shelf.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return shelf.size();
	}

}
