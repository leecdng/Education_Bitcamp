
public class Car { //public class Car extends Object {
	int speed = 0;
	final int SPEED_MAX = 180;
	final int SPEED_MIN = 0;
	String carName = "�׷���";
	
	public Car() {
		System.out.println("Car()�� �����ڸ޼��� ����");
	}
	
	public Car(String carName) {
		this.carName = carName;
		System.out.println("Car(String) �����ڸ޼��� ����, carName = "+carName);
	}
	
	
	public void speedUp() {
		speed++;
		if(speed>=SPEED_MAX) speed = SPEED_MAX; // �ִ� �ӵ��� ���� �ʴ´ٴ� ��
		System.out.println("speedUp -> speed= "+speed);
	}
	
	public void speedDown() {
		speed--;
		if(speed<=SPEED_MIN) speed = SPEED_MIN; // �ּ� �ӵ�(0) �Ʒ��� ���� ����
		System.out.println("speedDown -> speed = "+speed);
	}
}