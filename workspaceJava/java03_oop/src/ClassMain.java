

public class ClassMain {

	public static void main(String[] args) {	// 메인을 안 만들면 프로그램이 시작이 안 됨
		// ClassTest에서 구현해 놓은 게 필요해
		ClassTest ct = new ClassTest();
		//						객체명.멤버변수
		//System.out.println("b="+ct.b);
		
		//new ClassTest(5678); // 앞에 =을 지우면 변수 보관을 안 할 뿐 지워도 된다..?
		
		ClassTest ct2 = new ClassTest(5678);
		
		// 메소드 호출 : 객체명.메소드명()
		ct.sum();
		ct.total(100, 200); // 각각 int a b를 더함
		
		ct2.total(1000, 2000); // -- 같은 클래스라 ct2에도 있음
		
	}

}
