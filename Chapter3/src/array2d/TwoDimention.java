package array2d;

public class TwoDimention {

	public static void main(String[] args) {
		// 정수형 2차원 배열 선언
		
		//저장방법 1
//		int[][] a = new int[2][3];
//		
//		//행의 크기(배열의 이름)
//		System.out.println(a.length);
//		//열의 크기
//		System.out.println(a[0].length); //1열
//		System.out.println(a[1].length); //2열
//		
//		//전체 출력
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		//배열값 저장
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 4;
//		a[1][1] = 5;
//		a[1][2] = 6;
		
		//저장방법 2
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		//전체 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
				
	}

}
