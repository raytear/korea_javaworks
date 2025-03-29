package chap2;

public class Bread {

	public static void main(String[] args) {
		// 빵 25개를 4명이 나눠 가질 경우 각자의 몫과 남은 빵의 개수를 구하시오.
		
		int bread = 25;
		int person = 4;
		int share, remainder;
		
		share = bread / person; //몫
		remainder = bread % person; //나머지
		
		System.out.println("각자의 몫: " + share);
		System.out.println("남은 빵의 개수: " + remainder);

	}

}
