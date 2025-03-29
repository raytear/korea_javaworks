package loop;

public class WhileEx2 {

	public static void main(String[] args) {
		// 반복 조건문(while ~ if ~ break)
		//1부터 10까지 출력
		int n = 1;
		/*while(true) {
			if(n > 10)
				break;
			System.out.println(n);
			n++;
		}*/
		
		int sum = 0;
		double avg;
		
		while(true) {
			if(n > 10)
				break; //반복문 탈출
			sum += n; //sum = sum + n
			n++;
		}
		avg = (double) sum / (n-1);
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);

	}

}
