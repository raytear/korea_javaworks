package reference.score2;

public class Main {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student lee = new Student(1001, "이정후");
		Student shin = new Student(1002, "신유빈");
		
		// 과목 추가
		lee.addSubject("국어", 90);
		lee.addSubject("수학", 85);
		lee.addSubject("과학", 80);
		
		shin.addSubject("국어", 95);
		shin.addSubject("수학", 88);
		shin.addSubject("과학", 80);
		
		// 정보 출력
		lee.displayInfo();
		shin.displayInfo();
	}

}
