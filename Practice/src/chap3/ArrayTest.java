package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * 배열 길이가 5인 정수 배열을 선언하고, 1 ~ 10중 짝수만을 배열에 저장한 후
		   그 합과 평균을 계산하세요.
		 */
		
		//int[] arr = {2,4,6,8,10};
		int[] arr = new int[]{2,4,6,8,10};
		
		System.out.println("배열의 길이: " + arr.length);
		
		//전체 합계
		int total = 0; //합계를 저장할 변수
		double avg; //평균 저장 변수
		
		for(int i=0; i<arr.length; i++) {
			//계산
			total += arr[i]; //total = total + arr[i];
		}
		//평균 계산
		avg = (double)total / arr.length;
		
		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);
		System.out.println();		

	}

}
