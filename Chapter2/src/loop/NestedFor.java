package loop;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문 - 반복문 내부에 반복문이 사용됨
		// 행, 열로 표현
		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=5; j++) { //열
				System.out.print("*");
			}
			System.out.println(); //다음 행으로 줄바꿈
		}
		System.out.println();
		
		//직각 삼각형 모양의 별
		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=i; j++) { //열
				System.out.print("*");
			}
			System.out.println(); //다음 행으로 줄바꿈
		}
		System.out.println();
		
		//역 직각 삼각형
		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=6-i; j++) { //열
				System.out.print("*");
			}
			System.out.println(); //다음 행으로 줄바꿈
		}
		System.out.println();

		//구구단 전체 출력
		for(int i=2; i<10; i++) { //2단 ~ 9단
			for(int j=1; j<=9; j++) { //1~9 곱하는 수
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
