package reference.score2;

import reference.score.Subject;

public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects; //Subject 배열 선언
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];		
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //과목 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) {  //배열 공간이 비어있으면
				subjects[i] = subject; //배열에 저장
				break;
			}
		}
	}
	
	//학생 정보 및 평균 계산
	public void displayInfo() {
		int total = 0; //총점
		int count = 0; //개수	
		double avg;	   //평균
		//학번, 이름 출력
		System.out.println("학번: " + studentId +
				"\n이름: " + studentName);
		//과목 출력
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] != null) { //배열이 비어있지 않으면
				total += subjects[i].getScorePoint(); //총점 계산
				count++; //개수 1 증가
				
				System.out.println(	  //출력
						subjects[i].getSubjectName() +
						" 점수: " + subjects[i].getScorePoint());
			}
		}
		System.out.println("---------------");
		
		//평균 계산 = 총점 / 개수
		avg = (double)total / count;
		System.out.printf("평균 점수: %.1f점", avg);
		System.out.println("\n===============");
	}

}
