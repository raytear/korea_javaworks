package reference.score;

public class ScoreMain {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student lee = new Student(1001, "이정후");
		Student shin = new Student(1002, "신유빈");
		
		// 과목 설정
		lee.setKoreanSubject("국어", 90);
		lee.setMathSubject("수학", 85);
		
		shin.setKoreanSubject("국어", 95);
		shin.setMathSubject("수학", 88);
		
		// 학생 정보 출력
		lee.showStudentInfo();
		shin.showStudentInfo();

	}

}
