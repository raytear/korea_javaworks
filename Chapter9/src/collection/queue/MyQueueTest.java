package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		// MyQueue 객체 생성
		MyQueue queue = new MyQueue();
		
		//요소 추가 - 순서(A → B → C)
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		//요소 삭제 - 순서(A → B → C)
		System.out.println(queue.deQueue()); //A
		System.out.println(queue.deQueue()); //B
		System.out.println(queue.deQueue()); //C
		System.out.println(queue.deQueue());
		
	}

}
