package salestatement;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Drink coffee = new Drink("커피", 2500, 4);
		Drink tea = new Drink("녹차", 3500, 3);
		Alcohol soju = new Alcohol("소주", 4000, 2, 15.2f);
		
		//매출 전표 출력
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		
		//알콜 매출 전표 출력
		Alcohol.printTitle();
		soju.printData();
		
		//총합계 금액
		int total = 0;
		total = coffee.calcPrice() + tea.calcPrice() + soju.calcPrice();
		System.out.println("********** 합계 금액: " + total + "원 **********");

	}

}
