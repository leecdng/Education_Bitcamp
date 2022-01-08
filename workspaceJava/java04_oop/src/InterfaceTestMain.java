// 클래스에서 인터페이스를 상속받을 경우 implements 키워드를 이용한다.
//		   인터페이스를 여러개 상속 받을 수 있다.
//		   상속 받은 모든 추상메서드는 오버라이딩 해야 한다.
public class InterfaceTestMain implements InterfaceTest1, InterfaceTest2 {
	
	public InterfaceTestMain() {
		
	}
	
	// 추상메서드 오버라이딩
	public void output() {
		// 구현할 게 없어도 비어있게라도 해야 함.
	}
	public int sum() {
		return 5050;
	}
	
	public void oddSum() {
		int sum=0;
		for(int i=1; i<=MAX; i+=2) {
			sum+=i;
		}
		System.out.println("1~"+MAX+"까지의 합은 "+sum);
	}
	public int evenSum() {
		int sum = 0;
		for(int i=2; i<=MAX; i+=2) {
			sum+=i;
		}
		return sum;
	}
	public void resultPrint(int data) {
		System.out.println("결과값= "+data);
	}
	
	
	public void start() {
		resultPrint(sum()); // 결과값= 5050
		oddSum(); // 1~100까지의 합은 2500
		resultPrint(evenSum()); // 결과값= 2550
	}

	public static void main(String[] args) {
		new InterfaceTestMain().start();
	}

}
