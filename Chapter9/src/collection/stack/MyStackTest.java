package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		//요소 넣기 - 순서(0-강아지, 1-고양이, 2-소)
		stack.push("강아지"); 
		stack.push("고양이"); 
		stack.push("소");
		
		//요소의 개수
		System.out.println("요소의 총 개수: " + stack.getSize());
		
		//요소 삭제 - 순서(2-소, 1-고양이, 3-강아지)
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
