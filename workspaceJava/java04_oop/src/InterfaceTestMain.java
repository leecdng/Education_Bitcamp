// Ŭ�������� �������̽��� ��ӹ��� ��� implements Ű���带 �̿��Ѵ�.
//		   �������̽��� ������ ��� ���� �� �ִ�.
//		   ��� ���� ��� �߻�޼���� �������̵� �ؾ� �Ѵ�.
public class InterfaceTestMain implements InterfaceTest1, InterfaceTest2 {
	
	public InterfaceTestMain() {
		
	}
	
	// �߻�޼��� �������̵�
	public void output() {
		// ������ �� ��� ����ְԶ� �ؾ� ��.
	}
	public int sum() {
		return 5050;
	}
	
	public void oddSum() {
		int sum=0;
		for(int i=1; i<=MAX; i+=2) {
			sum+=i;
		}
		System.out.println("1~"+MAX+"������ ���� "+sum);
	}
	public int evenSum() {
		int sum = 0;
		for(int i=2; i<=MAX; i+=2) {
			sum+=i;
		}
		return sum;
	}
	public void resultPrint(int data) {
		System.out.println("�����= "+data);
	}
	
	
	public void start() {
		resultPrint(sum()); // �����= 5050
		oddSum(); // 1~100������ ���� 2500
		resultPrint(evenSum()); // �����= 2550
	}

	public static void main(String[] args) {
		new InterfaceTestMain().start();
	}

}