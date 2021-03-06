									// 추상클래스 상속
public class AbstractTestMain extends AbstractTest {

	public AbstractTestMain() {
		
	}
	
	// 상속받은 추상클래스 내의 모든 추상메소드를 오버라이딩 한다.
	// 오버라이딩 할 땐 추상메서드 표시 안 함. 실행문 적으면 추상메서드 아님.
	public void print() {
		System.out.println("num="+num+", name="+name);
	}
	
	public void setData(int num, String name) {	// 오버라이딩 할 때 매개변수 타입, 개수는 같아야 하고 변수명은 달라도 상관 없다.
		this.num = num; // super.num = num;
		this.name = name; // super.name = name;
	}

	public void start() {
		//numOutput();
		setData(5000, "이순신");
		print();
	}
	
	
	public static void main(String[] args) {
		AbstractTestMain am = new AbstractTestMain();
		am.start();
	}

}
