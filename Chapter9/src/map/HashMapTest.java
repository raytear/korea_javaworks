package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// Map 자료형으로 HashMap을 생성
		// 이름과 점수 저장하기
		Map<String, Integer> map = new HashMap<>();
		
		//요소 저장
		map.put("강감찬", 95);
		map.put("홍길동", 75);
		map.put("이순신", 80);
		
		//요소의 개수
		System.out.println("요소 수 - " + map.size() + "개");
		
		//요소 검색 - 순서가 없어서 인덱싱 못하고, key로 값을 검색함
		System.out.println("홍길동의 점수: " + map.get("홍길동") + "점");
		
		//요소 추가(수정)
		map.put("이순신", 90);
		
		//map 객체 출력
		System.out.println(map);
		
		//요소 삭제
		if(map.containsKey("홍길동")) {
			map.remove("홍길동");
		}
		
		//전체 출력 - 반복자 클래스(Iterator) 사용, while문 사용
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) { //요소가 있다면(비어있지 않다면)
			String key = ir.next();	//요소를 가져와서 key에 저장
			Integer value = map.get(key); //키로 검색한 점수를 저장
			System.out.println(key + " : " + value);
		}
	}

}
