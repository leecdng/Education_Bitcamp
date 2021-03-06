// 외부클래스
public class OuterClass {
	int num = 100;
	String name = "홍길동";
	public OuterClass() {
		System.out.println("OuterClass 생성자 메서드 실행됨");
	}

	public void print() {
		System.out.println("num="+num);
		System.out.println("name="+name);
		// 외부클래스에서 내부클래스의 멤버변수는 접근불가하다.
		//System.out.println("tel="+tel);
	}
	
	public void createInner() {
		// 클래스 내에서 내부클래스 객체 생성하기
		InnerClass cc = new InnerClass();
		cc.tel = "010-9999-9999";
		cc.output();
	}
	
	// 내부클래스
	class InnerClass{
		// 멤버면서
		String tel = "010-1234-5678";
		//생성자메소드
		InnerClass(){
			System.out.println("InnerClass생성자 메소드 실행됨");
		}
		//메소드
		public void output() {
			System.out.println("tel="+tel);
			// 외부클래스의 멤버변수는 내부클래스에서 접근할 수 있다.
			System.out.println("num--->"+num);
			System.out.println("name--->"+name);
		} 
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass(); // 내부클래스를 제외한 외부클래스만 실행됨
		oc.print(); // 외부클래스의 생성자, 외부 print 메서드 실행
		
		// 내부클래스 객체 생성하기
		// 1. 외부클래스 객체를 먼저 생성 -> 내부클래스 객체 생성
		InnerClass ic = new OuterClass().new InnerClass();
		ic.output(); // 외부클래스의 생성자, 내부클래스의 생성자, 내부 output 메서드 실행
		
		// 2. 외부클래스 객체를 먼저 생성 / 내부클래스의 객체 생성
		OuterClass oc2 = new OuterClass();
		InnerClass ic2 = oc2.new InnerClass();
		ic.output(); // 외부클래스의 생성자, 내부클래스의 생성자, 내부 output 메서드 실행
		
		// 3. 클래스 내 메서드에서 내부클래스 객체 생성하고 메서드 불러오기. // 여기서는 010-9999-9999로 바꾼 번호 적용됨.
		OuterClass oc3 = new OuterClass();
		oc3.createInner(); // 외부클래스의 생성자, 외부 createInner 메서드 실행 = 내부클래스 객체 생성, output메서드
		
		
		
	}


}
