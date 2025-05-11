package abstract_class.game_level;

//초보자 클래스 정의
public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 할 줄 몰라요.");
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 몰라요.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다 *****");
	}

}
