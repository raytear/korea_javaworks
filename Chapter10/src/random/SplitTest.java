package random;

import java.util.Random;

public class SplitTest {

	public static void main(String[] args) {
		// 배열과 문자열
//		String[] season = {"봄", "여름", "가을", "겨울"};
//		System.out.println(season[1]); //여름
//		
		//문자열을 배열로 분리 - String 클래스의 split()
		String str = "봄 여름 가을 겨울";
		String[] season = str.split(" "); //공백문자로 분리한 배열
//		System.out.println(season[1]); //여름
		
		//랜덤 추출
		Random rnd = new Random();
		int rndIdx = rnd.nextInt(season.length); //0 ~ 3
//		System.out.println(rndIdx);
		System.out.println(season[rndIdx]);
		
	}

}
