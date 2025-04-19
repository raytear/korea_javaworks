package array2d;

public class CalcArray {

	public static void main(String[] args) {
		// 2차원 정수형 배열 생성
		int[][] numbers = {
			{1, 2, 3, 4},
			{6, 6, 7}
		};
		int sum = 0; //합계
		int count = 0; //개수
		double avg;	 //평균
		
		//특정 요소 검색 - 인덱싱
		int x = numbers[1][1];
		System.out.println(x); //6
		
		//전체 검색
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
		}
		System.out.println();
		
		//배열의 크기
		System.out.println("배열의 크기: " + numbers.length);
		
		//요소의 합계
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum += numbers[i][j];
				count++; //for문을 순회할 때 1씩 증가
			}
		}
		//평균
		avg = (double)sum / count;
		
		System.out.println("합계: " + sum);
		System.out.println("개수: " + count);
		System.out.printf("평균: %.1f", + avg);
		
	}

}
