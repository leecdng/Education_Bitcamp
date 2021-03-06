
public class MethodTest {
	// 멤버영역\
	int num = 12;
	String name="홍길동";
	String tel;	//null
	// 생성자 메소드 : 생략시 자동 추가(JVM)
	//				상속관계가 아닐 때만 추가해준다.
	MethodTest(){}	// 필요하든 안 하든 하나 넣어준다 오류 없게 하려고
	MethodTest(String tel){	// 지역변수
		System.out.println("연락처:"+tel);
	}
	// MethodTest(String name){}
	// 생성자 메소드를 여러 개 만들 수는 있지만 같은 형식으로 두 개는 안 됨(데이터 타입과 변수 개수가 같으면 안 됨)
	MethodTest(int num){}
	MethodTest(int num, String name){
		// this : 현재객체 (현재클래스)
		this.num = num;	// 멤버변수 = 지역변수;
		this.name = name;
		String tel ="12345";
		this.tel = "02-1234-1234";	// this는 지역변수에 있어야만 쓴다.
	}
	MethodTest(String name, int num){ // 순서 바뀌면 가능, 실행할 때도 순서 중요
		// 생성자 메소드에서 다른 생성자 메소드 호출하기
		// 메서드명(값1, 값2,..);
		// 생성자메소드에서 다른 생성자를 호출할 때는 메서드명을 직접 표기할 수 없고
		// this()
		//MethodTest(num, name);	// X 메서드명 직접 표기해서 에러
		// this() 이용하여 다른 생성자 메소드를 호출할 때는 반드시 첫 번째 실행문이어야 함
		//System.out.println(); // 앞에 다른 실행문 넣으면 에러남..
		this(num, name); //위에 있는 생성자 호출한 것, num, name 순서 바꾸면 오류남
	}
	
	
}


