package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		//Company 객체 생성
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		//두 변수가 같은 주소인지 확인
		System.out.println(company1 == company2);
		
		System.out.println(company1);
		System.out.println(company2);

	}

}
