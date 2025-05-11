package abstract_class.game_level;

public class Player {
	//PlayerLevel 클래스를 참조
	private PlayerLevel level;
	
	public Player() {
		//초보자 레벨만 생성
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count); //템플릿 메서드 사용
	}
	
	//레벨 설정(setter)
	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

}
