package regexpression;

public class RegExpTest2 {

	public static void main(String[] args) {
		//문자열 처리 함수(String 클래스) - replaceAll(정규표현식, 대체기호)
		
		//비밀번호 보안 처리
		//영문자[a-zA-Z]나 숫자[0-9]가 아니면 '*'로 마스킹
		//'^'기호가 [] 안에 있으면 부정(아니다), [] 밖에 있으면 시작점을 의미
		String password = "P@ssw0rd!";
		String masked = password.replaceAll("[^a-zA-Z0-9]", "*");
		System.out.println(masked);	//P*ssw0rd*
		
		//게시글 금칙어 처리
		String text = "안녕@하세요! #스팸";
		
		//한글과 공백만 허용 - [ㄱ-힣] [\s]
		String filtered = text.replaceAll("[^ㄱ-힣\s]", "*");
		System.out.println(filtered); //안녕*하세요* *스팸
		
	}

}
