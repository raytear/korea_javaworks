package switchex1;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch ~ case 구문
		// 메달의 색상에 따른 종류 - 금메달, 은메달, 동메달
		String medalColor = "Gold";
		
		switch(medalColor) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break; //break 입력 주의. break 안 넣으면 "은메달" 값까지 출력됨
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
		default:
				System.out.println("메달이 없습니다.");
		}

	}

}
