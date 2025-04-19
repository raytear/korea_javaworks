package arrays;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호를 저장할 배열 생성
		int[] lotto = new int[6];
		
		//로또 번호 1개 추첨
//		lotto[0] = (int)(Math.random() * 45) + 1;
//		System.out.println(lotto[0]);

		//로또 랜덤 번호 저장
		for(int i=0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			//중복 번호 제거
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					i--;
			}
		}
		/*
		 	중복 예) 41 31 31 13 7 45
		 	i=0, 41 		--> 결정
		 	i=1, j=0  31 	--> 결정
		 	i=2, j=0, 31
		 	 	 j=1, 31 중복 i--
	 	 	i=3, j=0, 31
		 	 	 j=1, 15
		 	 	 j=2, 13		 	 	 		 			 	
		 */
		
		//출력
		for(int i=0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
