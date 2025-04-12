package methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜와 시간 표기
		Date today = new Date();
		System.out.println(today);
		
		// 날짜 표기 - MM은 대문자로
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(today));
		
		// 시간 표기
		//SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); //12 시각제
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss"); //24 시각제 
		System.out.println(time.format(today));
	}

}
