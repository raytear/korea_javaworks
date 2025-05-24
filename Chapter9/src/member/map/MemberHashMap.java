package member.map;

import java.util.HashMap;
import java.util.Iterator;

import member.Member;

//자료 관리 클래스(HashMap 자료구조 활용)
public class MemberHashMap {
	//HashMap<회원아이디, 회원> 자료 구조의 객체 선언
	HashMap<Integer, Member> hashMap;
	
	//생성자
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록 조회
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { //자료가 있다면
			int key = ir.next(); //키를 가져와서
			Member member = hashMap.get(key); //가져온 키를 회원에 저장(value 가져옴)
			System.out.println(member);
		}
		System.out.println();
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //memberId가 이미 등록되었다면
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
}
