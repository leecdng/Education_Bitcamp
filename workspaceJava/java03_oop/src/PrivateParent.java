
public class PrivateParent {
	// private ���������ڴ� �ٸ� Ŭ������ ��ü�� ���Ͽ� ������ �� ����.
	//		   ������� ����
	private int num = 200; // ĸ��ȭ
	// ������ �޼ҵ忡 private ���������ڴ� ��ü�� ������ �� ����.
	PrivateParent() { // ������ �޼ҵ尡 private�̸� �����ڵ� �׷��� �Ѵ�?????
		
	}
	
	// ��ü�� ���ؼ� ���ٺҰ�
	// ��ӵ� �� ��.
	private void getData() {
		System.out.println("��ȣ= " + num);
	}

}