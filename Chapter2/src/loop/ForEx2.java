package loop;

public class ForEx2 {

	public static void main(String[] args) {
		// 문자 세트 - 아스키 코드, 유니 코드
		char ch; //전역 변수(전체에 영향을 미치는 변수)
		//ch = 65; 
		//ch = (char)(ch + 1);
		//ch++;
		//System.out.println(ch);
		
		for(ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//한글 출력 - 유니코드
		for(ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//구구단 출력 - 6 x 1 = 6, 6 x 2 = 12
		int dan = 6;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}

	}
	
}