
public class MethodTest2Main {

	public MethodTest2Main() {
		
	}

	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		
		String gugu = mt.gugudan(8);
		System.out.println(gugu);
		
		// ��ȯ���� ���� �޼ҵ� ȣ��	// ���� ���� �׳�..
		mt.powerStart();
		
		//
		mt.channelUp(); // 12
		mt.channelUp(); // 13
		mt.channelDown(); // 12
		
		// static�� ���� �޼ҵ�� �ݵ�� ��ü�� ����� �޼��带 ȣ���ؾ� �Ѵ�.
		mt.sum(20);
		// static�� �޼����� ��ȯ�� ���ʿ� �ִ� ���� �޼ҵ带 ��ü �������� �ʰ� ȣ�� ����
		// Ŭ������.�޼����(�Ű�����);
		MethodTest2.sum(50);

	}

}