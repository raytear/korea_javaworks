package enums;

public class SeasonTest {

	public static void main(String[] args) {
		Season season = null;	//초기화 설정
		season = Season.여름;
		
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
		default:
			System.out.println("계절이 없습니다.");
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다.");
		
		if(season == Season.여름) { //동등 비교 연산자 사용
			System.out.println("무더위와 장마가 옵니다.");
		}else {
			System.out.println("무더위와 장마가 별로 없습니다.");
		}
	}
}
