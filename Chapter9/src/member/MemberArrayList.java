package member;

import java.util.ArrayList;

//회원을 관리(추가, 조회, 삭제)하는 클래스
public class MemberArrayList {
	//ArrayList 자료 구조 선언
	private ArrayList<Member> arrayList;
	
	//ArrayList 생성
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 조회
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			//이미 등록된 memberId를 dbId에 저장함
			int dbId = arrayList.get(i).getMemberId();
			if(dbId == memberId) {   //외부에서 입력한 memberId와 일치하면
				arrayList.remove(i); //해당 객체 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		
		return false;
	}
}
