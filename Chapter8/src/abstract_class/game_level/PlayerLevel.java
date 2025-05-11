package abstract_class.game_level;

public abstract class PlayerLevel {
	//추상 메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메서드(여러 기능을 묶어놓은 메서드)
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();	//jump()는 횟수가 있음
		}
		turn();	
	}
	
}
