package chap5;

public class Member {
	//멤버 변수
	private String id;
	private String password;
	
	//생성자
	public Member(String id, String password) {
		this.id = id;
		this.password = password;		
	}
	
	//정보 출력 메서드
	public void showMemberInfo() {
		System.out.println("id: "+ id + ", password: " + password);
	}

}
