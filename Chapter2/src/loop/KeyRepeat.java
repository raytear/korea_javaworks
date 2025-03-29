package loop;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		/*
		   @ 키 입력에 따른 동작 제어
		   'y' - "계속 반복"
		   'n' - "반복 중단"
		   그 이외의 키 - "지원되지 않음. 다시 입력"	 
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) ");
			String key = scan.nextLine(); //문자는 쌍따옴표
			
			if(key.equals("y")) {
				System.out.println("계속 반복합니다.");
			}else if(key.equals("n")) {
				System.out.println("반복을 중단합니다.");
				break; //반복 탈출
			}else {
				System.out.println("키를 잘못 눌렀습니다. 다시 입력하세요");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();

	}

}
