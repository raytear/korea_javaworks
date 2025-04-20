package reference.score;

public class Subject {
	private String subjectName; //과목명
	private int scorePoint; //점수
	
	//과목 설정(setter)
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//접근자(getter)
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}

}
