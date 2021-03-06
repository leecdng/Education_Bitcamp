// extends 키워드를 이용하여 클래스를 상속 받는다.
//		   클래스는 1개만 상속 받을 수 있다.
public class Truck extends Car {
	int speed = 100;
	public Truck() {
		System.out.println("Truck()의 생성자메서드 실행");
		
		System.out.println("Truck.speed->"+speed);
		super.speedUp();
	}
	
	public Truck(String carName) {
		// 상위클래스의 생성자 메서드 호출
		super(carName); // this처럼 실행문 첫 번째 줄에 써야 함
		System.out.println("Truck(String)생성자 실행");
	}
	
	// 오버라이딩(overriding) : 상위클래스의 메서드를 하위클래스에서 재정의
	//						 반환형, 메서드명, 매개변수가 같은 메서드를 재정의하는 것
	public void speedUp() {
		speed += 10;
		if(speed>=SPEED_MAX) {
			speed = SPEED_MAX;
		}
		System.out.println("truck.speed="+speed);
	}
	
	
	
	
	public static void main(String a[]) {
		// 상속관계에서 객체생성 시 상위클래스의 생성자가 먼저 실행되고
		// 그 다음에 하위클래스의 생성자가 실행된다.
		Truck t = new Truck();
		
		System.out.println("t.speed="+t.speed); // 0
		// 상위클래스의 메서드 호출
		t.speedUp(); // 1 -> 하위클래스에서 오버라이딩 후엔 하위클래스가 실행돼서 110 출력
		t.speedUp(); // 2 // 120
		t.speedDown(); // 1
		// 상위클래스는 하위클래스의 변수를 가져다 쓸 수 없기 때문에 위 메서드 결과는 1, 2, 1 이렇게 나온 것
		
		// 상위클래스의 생성자를 선택적으로 호출하기
		Truck tt = new Truck("소나타");
		System.out.println("tt.carName = "+ tt.carName);
	}

}
