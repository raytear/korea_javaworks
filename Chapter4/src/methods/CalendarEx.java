package methods;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	public static void main(String[] args) {
		//Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		//날짜와 시간
		System.out.println(cal.getTime()); //Date today = new Date(); 와 같음
		
		//현재 시간 - 1970.1.1 자정이후부터 현재까지 시간을 밀리초로 표기
		//초(s) - 1, 밀리초(ms) - 1/1000, 마이크로초 - 1/백만, 나노초 - 1/1억
		
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/(24*60*60*1000)); //일로 환산
		System.out.println(cal.getTimeInMillis()/(24*60*60*1000)/365); //년으로 환산
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR); //상수 표기 - YEAR
		System.out.println(year + "년");
		
		//배열은 인덱스가 0부터 시작이므로, +1을 안하면 3월로 출력됨
		//월은 0 ~ 11까지
		int month = cal.get(Calendar.MONTH) +1;
		System.out.println(month + "월");
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date + "일");
		
		//시간 - 시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour + "시");
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute + "분");

		int second = cal.get(Calendar.SECOND);
		System.out.println(second + "초");
		
		//요일 - {1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토}
		//요일은 1 ~ 7까지
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		//days는 배열이므로, 0부터 시작함. day에서 -1 해줌
		String[] days = new String[] {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println("오늘은 " + days[day-1] + "입니다.");

	}

}
