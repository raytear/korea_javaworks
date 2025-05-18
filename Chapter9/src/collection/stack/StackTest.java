package collection.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		// Coin 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		
		// Stack 자료형 사용
		// LIFO(Last In First Out) - 후입 선출
		Stack<Coin> coinBox = new Stack<>();

		// 스택에 동전 넣기 - push()
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		
		//스택에서 동전 꺼내기 - pop()
//		System.out.println(coinBox.pop().getValue());
//		System.out.println(coinBox.pop().getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
		
	}

}
