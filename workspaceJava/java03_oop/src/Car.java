
public class Car { //public class Car extends Object {
	int speed = 0;
	final int SPEED_MAX = 180;
	final int SPEED_MIN = 0;
	String carName = "그랜져";
	
	public Car() {
		System.out.println("Car()의 생성자메서드 실행");
	}
	
	public Car(String carName) {
		this.carName = carName;
		System.out.println("Car(String) 생성자메서드 실행, carName = "+carName);
	}
	
	
	public void speedUp() {
		speed++;
		if(speed>=SPEED_MAX) speed = SPEED_MAX; // 최대 속도를 넘지 않는다는 뜻
		System.out.println("speedUp -> speed= "+speed);
	}
	
	public void speedDown() {
		speed--;
		if(speed<=SPEED_MIN) speed = SPEED_MIN; // 최소 속도(0) 아래로 가지 않음
		System.out.println("speedDown -> speed = "+speed);
	}
}
