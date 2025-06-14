package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// List 자료구조 사용
//		List<String> companyList = new ArrayList<>();
//		
//		//데이터 추가
//		companyList.add("LG");
//		companyList.add("삼성");
//		companyList.add("Hyundai");
//		
		//Arrays 클래스
		List<String> companyList = Arrays.asList("LG", "삼성", "Hyundai");
		
		//범위 기반 for
		for(String company : companyList)
			System.out.println(company);
		System.out.println("-----------------------------");
		
		//Stream 클래스 활용 - 람다식으로 구현, 배열이나 컬렉션(리스트) 자료 처리할 때
		//stream 객체(인스턴스) 생성
		//출력 - forEach() 함수 사용, 일치 - map(), 필터링 - filter()
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));

		//배열에서 String 클래스 사용하기
		String[] fruits = {"apple", "banana", "grape"};
		
		for(String fruit : fruits)
			System.out.println(fruit);
		
		//Stream 인스턴스 생성
		//배열을 처리할 때 Arrays 클래스 사용
		Stream<String> stream2 = Arrays.stream(fruits);
		stream2.forEach(fruit -> System.out.println(fruit));
	}

}
