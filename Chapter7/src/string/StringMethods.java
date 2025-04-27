package string;

public class StringMethods {

	public static void main(String[] args) {
		//charAt(문자열) - 문자열에서 한개의 문자 추출
		//문자열은 특별한 1차원 배열이다.
		String msg = "행운을 빌어요!!";
		
		char ch = msg.charAt(0); //행
		char ch2 = msg.charAt(4); //빌
		System.out.println(ch);
		System.out.println(ch2);
		
		//주민등록번호에서 남여를 구분
		//주민번호의 7번째 문자가 1,3 - 남, 2,4 - 여
		String jumin = "020615-3321234";
		char gender = jumin.charAt(7); //성별을 저장하는 변수
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남성입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여성입니다.");
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			break;
		}
		
		//substring(시작인덱스,끝인덱스) - 여러개의 문자열 잘라내기(추출하기)
		//substring(인덱스) - 인덱스부터 끝까지 추출함
		//주민등록번호의 앞부분 - firstNum, 뒤 - secondNum
		String firstNum = jumin.substring(0, 6); //끝인덱스-1을 추출
		System.out.println("생년월일: " + firstNum);
		
		String secondNum = jumin.substring(7);
		System.out.println("주민번호 뒷자리: " + secondNum);
		
		//indexOf(문자열) - 문자열이 시작되는 위치를 리턴하는 메서드
		//못 찾으면 -1이 리턴됨
		String subject = "자바 프로그래밍 입문";
		int location1 = subject.indexOf("프로그래밍");
		System.out.println(location1); //3
		
		int location2 = subject.indexOf("코딩");
		System.out.println(location2); //-1
		
		//문자열을 검색하는 프로그램
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요!!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!!");
		}
	}

}
