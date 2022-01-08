
public class WrapperTest {

	public WrapperTest() {
		// Wrapper클래스는 기본데이터형의 정보를 객체로 변경시키는 클래스이다.
		// Byte, Short, Integer, Long
		// Float, Double
		// Boolean
		// Character
		
		int a = 1234;
		Integer i = Integer.valueOf(a); // new Integer(a);
		
		System.out.println(a);
		System.out.println(i);
		
		Object obj = a;	// 오토박싱
		Object obj2 = i;
		System.out.println(obj);
		System.out.println(obj2);
		
		
		int x = i; // 오토언박싱
		System.out.println(x);
	}

	public static void main(String[] args) {
		new WrapperTest();

	}

}
