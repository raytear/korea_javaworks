package generic.box2;

//비제네릭 타입으로 클래스 정의
public class Box {

	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}
