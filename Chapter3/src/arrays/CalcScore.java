package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// 성적 처리 프로그램 - 사용자 입력 방식
		boolean run = true;  // 프로그램 시작과 종료 - 스위치 변수
		int studentNum = 0;  // 학생수를 저장할 변수. 숫자를 공란으로 할 때는 0
		int[] scores = null; //점수를 저장할 배열. 배열을 공란으로 할 때는 null
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("==============================================");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("==============================================");
			System.out.print("선택> ");
			
			int menu = sc.nextInt(); //메뉴 입력
			switch(menu) {
			case 1:
				System.out.print("학생수> ");
				studentNum = sc.nextInt(); //학생수 입력
				scores = new int[studentNum]; //점수를 저장할 배열 생성
				break;
			case 2:
				if(scores != null) { //배열이 null이 아닐 때 수행함.
					for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt(); //점수 입력
					}
				}	
				break;
			case 3:
				if(scores != null) {
					for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]= " + scores[i]);
					}
				}	
				break;
			case 4:
				if(scores != null) {
					int sum = 0; //합계
					double avg;  //평균
					int max;	 //최고 점수
					max = scores[0]; //요소의 첫번째 값을 최대값으로 설정
					
					for(int i=0; i<scores.length; i++) {
						sum += scores[i]; //sum = sum + scores[i]
						if(scores[i] > max) //점수가 최대값보다 크면
							max = scores[i]; //최대값에 점수를 저장
					}
					//평균 = 합계 / 개수
					avg = (double)sum / scores.length;
					//System.out.println("평균 점수: " + avg);
					System.out.printf("평균 점수: %.1f\n", avg);
					System.out.println("최고 점수: " + max);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 입력하세요.");
				break;
			}
		}
		sc.close();
	}

}
