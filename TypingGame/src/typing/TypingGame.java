package typing;

import java.util.Random;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 1. 영어 단어 문자열 분리
		String str = "sun moon earth galaxy mountain "
				+ "flower tree bird girl man";
		
		// 2. 영어 타자 게임
		int n = 1; 			//문제 번호
		long start, end; 	//시작, 종료시간
		double elapsedTime; //소요시간
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[타자 게임], 준비되면 엔터> ");
		sc.nextLine(); //엔터
		
		start = System.currentTimeMillis(); //1970.1.1 자정 이후 밀리초(ms)
		//System.out.println(start); //1748663672963
		
		while(n < 11) {
			System.out.println("문제: " + n);
			String[] word = str.split(" ");
			//String question = word[0];
			Random rnd = new Random();
			int rndIdx = rnd.nextInt(word.length);
			String question = word[rndIdx]; //문제(랜덤 추출)
			System.out.println(question);
			
			String answer = sc.nextLine(); //사용자 단어 입력
			//question과 answer 비교
			if(answer.equals(question)) {
				System.out.println("통과!");
				n++; //다음 문제
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}	//while 닫기
		end = System.currentTimeMillis();
		elapsedTime = (double)(end - start) / 1000; //ms → s
		System.out.printf("게임 시간: %.2f", elapsedTime);
		
		sc.close();
	}
	
}