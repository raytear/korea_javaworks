package nestedfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		/*
		   입장객 수에 따른 좌석열과 줄을 만들어
		   자리배치하는 프로그램
		   - 입장객 수와 좌석열이 나누어 떨어지는 경우(나머지가 0인 경우)
		   - 입장객 수와 좌석열이 나누어 떨어지지 않는 경우
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력: ");
		int customer = sc.nextInt(); //입장객 수
		
		System.out.print("좌석 열 입력: ");
		int column = sc.nextInt();    //좌석 열수
		int row; 		   //줄 수
				
		if(customer % column == 0) {
			row = (int)(customer / column);
		}else { //customer % column != 0
			row = (int)(customer / column) + 1;
		}
//		System.out.println(row);
		
		//자리 배치도(행-row, 열-column)
		System.out.println("========== 자리 배치도 ==========");
		for(int i=0; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				int seat = i*column + j;
				if(seat > customer) break; //for문 빠져나옴
				System.out.print("좌석" + seat + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
