package interfaces.bookshelf;

//Queue 자료 구조 - 선입선출 방식
//구현시에 ArrayList 사용
public interface Queue {
	
	void enQueue(String title); //요소 추가
	
	String deQueue(); 			//요소 삭제
	
	int getSize(); 				//요소 개수
	

}
