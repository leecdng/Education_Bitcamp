import java.util.Calendar;
public class StaticTestMain {

	public StaticTestMain() {
		
	}

	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		StaticTest ss2 = new StaticTest();
		
		// static 변수는 값이 하나뿐..
		// 다른 메서드에서 변경한 변수 값은 또 다른 메서드에서 반영이 안 되지만
		// static 변수는 반영됨
		ss.setAddr("영등포구");
		
		String address = ss2.getAddr();
		System.out.println("address="+address); // 영등포구
		
		// static 멤버변수는 객체 생성하지 않고 사용할 수 있다.
		System.out.println("name=" + StaticTest.addr);
		
		Calendar now = Calendar.getInstance(); // 이것도 static이 있는 것
		System.out.println(now.get(Calendar.YEAR));

	}

}
