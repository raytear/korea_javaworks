package arrays;

public class ArrayString {

	public static void main(String[] args) {
		// 문자열 배열 관리
		String[] cars = {"소나타", "EV3", "BMW"};
		
		// 배열의 길이
		System.out.println("배열의 크기: " + cars.length);
		
		//"BMW" 검색
		System.out.println(cars[2]);

		//"EV3"를 "Ionic6"로 변경
		cars[1] = "Ionic6";
		
		//전체 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
	}

}
