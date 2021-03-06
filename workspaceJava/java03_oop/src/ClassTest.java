// package를 명시하는 곳

//필요한 클래스의 위치(패키지명과 클래스명을 정의한다.)
import java.util.Scanner;
import java.lang.String;	// compiler가 컴파일 과정에 자동으로 import해준다.
import java.util.Random;
// import java.util.*; // *표시는 모든 클래스를 의미 // 권장하는 방법은 아님

public class ClassTest {
	// 멤버영역
	/* 멤버변수 = 전역변수 */
	// 변수 많으면 위에다 정리함
 	int a=100;
	String name="홍길동";
	// 멤버변수는 초기값이 자동으로 설정된다.
	// 정수(bytem short, int, long) : 0
	// 실수(float, double) : 0.0
	// 논리(boolean) : false;
	// 문자(char) : //아무것도 없음
	// String, Scanner, Random = null
	int b;
	double c;
	String nameStr; // null
	Scanner scan; //null
	Random ran; // null
	// 객체생성이 가능하다.
	Scanner scanner = new Scanner(System.in);
	// 실행문은 멤버에서 사용 불가 --- 메소드 안에서 해야 함
	// System.out.println("콘솔문자 출력하기"); --- 못 씀 에러남
	int k = 100+500;
	// int dd[] = new int[10]; ---- 못 씀 에러남
	// dd[3]=200; ---- 못 씀 에러남
	
	// 생성자 메소드 : 객체를 생성할 때 한 번 실행되는 메소드 (하나의 작업 단위?)
	//				메소드명이 반드시 클래스명과 같아야 한다.
	//				객체 생성 시 객체의 데이터를 초기화할 수 있다.
	//		생성자 메소드를 구현하지 않으면 컴파일 시 컴파일러가 매개변수가 없는 생성자 메소드를 자동으로 추가해준다.
	//
	// 		ClassTest(){} 이렇게 자동으로 들어간다는 말
	
	ClassTest(){ //<- 매개변수가 없는 메소드
		b = 1234;	// 위에 int b 선언 있음 0이 초기값으로 들어있었음
		//실행문
		System.out.println("생성자메소드가 실행됨");
	}
	
	ClassTest(int a){ // <- 매개변수가 있는 메소드
		System.out.println(a+"메소드 실행");
	}
	
	
	// 메소드: 하나의 실행 단위 - 기능 구하려면 메소드 안에 구현해야 함
	// 		 클래스를 객체 생성 후 메소드를 호출해야 실행된다.
	// 반환형 메소드명(매개변수, 매개변수){ // 매개변수는 필요한 만큼 사용 가능
	// }
	// 메소드명 생성 규칙 :
	//				소문자로 시작한다. 합성어일 때는 두 번째 단어부터 첫 번째 글자를 대문자로
	void sum() {
		// 실행부
		System.out.println("sum()메소드가 실행됨");
	}
	void total(int a, int b) {
		System.out.println("합성"+(a+b));
	}
	
	// 내부클래스
}
