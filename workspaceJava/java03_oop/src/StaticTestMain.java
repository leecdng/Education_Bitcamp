import java.util.Calendar;
public class StaticTestMain {

	public StaticTestMain() {
		
	}

	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		StaticTest ss2 = new StaticTest();
		
		// static ������ ���� �ϳ���..
		// �ٸ� �޼��忡�� ������ ���� ���� �� �ٸ� �޼��忡�� �ݿ��� �� ������
		// static ������ �ݿ���
		ss.setAddr("��������");
		
		String address = ss2.getAddr();
		System.out.println("address="+address); // ��������
		
		// static ��������� ��ü �������� �ʰ� ����� �� �ִ�.
		System.out.println("name=" + StaticTest.addr);
		
		Calendar now = Calendar.getInstance(); // �̰͵� static�� �ִ� ��
		System.out.println(now.get(Calendar.YEAR));

	}

}