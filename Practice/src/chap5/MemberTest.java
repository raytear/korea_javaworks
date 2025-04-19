package chap5;

public class MemberTest {

	public static void main(String[] args) {
		//객체 배열
		Member[] members = new Member[3];
		
		//객체 생성 1
		members[0] = new Member("정은하", "j1234");
		members[1] = new Member("김우주", "k0000");
		members[2] = new Member("박하늘", "p4320");			
		
		System.out.println("********** 회원 현황 **********");
		for(int i=0; i<members.length; i++)
			members[i].showMemberInfo();
		
		//향상된 for문
		//for(자료형 변수 : 배열 이름){변수 이름 출력}
		for(Member member : members)
			member.showMemberInfo();

	}

}
