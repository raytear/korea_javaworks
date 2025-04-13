package memberservice;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		//true/false를 저장할 변수
		boolean result = service.login("hangang", "k2025");
		if(result) {//result == true
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		service.logout();

	}

}
