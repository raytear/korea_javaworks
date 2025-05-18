package interfaces.bookshelf;

import java.util.ArrayList;

//책 제목(String)을 저장할 선반 클래스 정의(ArrayList)
public class Shelf {
	//상속받은 자식 클래스만 접근 가능
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}

}
