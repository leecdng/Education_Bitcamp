

public class ClassMain {

	public static void main(String[] args) {	// ������ �� ����� ���α׷��� ������ �� ��
		// ClassTest���� ������ ���� �� �ʿ���
		ClassTest ct = new ClassTest();
		//						��ü��.�������
		//System.out.println("b="+ct.b);
		
		//new ClassTest(5678); // �տ� =�� ����� ���� ������ �� �� �� ������ �ȴ�..?
		
		ClassTest ct2 = new ClassTest(5678);
		
		// �޼ҵ� ȣ�� : ��ü��.�޼ҵ��()
		ct.sum();
		ct.total(100, 200); // ���� int a b�� ����
		
		ct2.total(1000, 2000); // -- ���� Ŭ������ ct2���� ����
		
	}

}