import java.util.Scanner;

public class OOP_Ex01 {

	public OOP_Ex01() {
//		int dan = danInput();
//		String result = gugudan(dan);
//		System.out.println(result);
		
		// System.out.println(gugudan(danInput()));
	}

	// �� �Է¹ޱ�
	int danInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է� = ");

		return scan.nextInt();
	}
	
	// ������ ����ϱ�
	String gugudan(int dan) {
		String gugu = "";
		for(int i=2; i<=9; i++) {
			gugu += dan+"*"+i+"="+ dan*i+"\n";
		}
		return gugu;
	}
	
	void start() {
		int dan = danInput();
		String result = gugudan(dan);
		System.out.println(result);
	}
	
	
	// ���� �޼���
	public static void main(String[] args) {
		OOP_Ex01 oop = new OOP_Ex01();
		
		// System.out.println(oop.gugudan(oop.danInput()));
		
		oop.start();
		

	}

}
// �ֿܼ��� ���� �Է¹޾� �Է¹��� �������� ����϶�
// 1) �� �Է¹ޱ� -> ���θ޼��忡�� �� �Է� ���� ���� ��ĳ�� ����ϱ�
// 2) ������ ���