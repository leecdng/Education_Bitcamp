
public class MethodTest {
	// �������\
	int num = 12;
	String name="ȫ�浿";
	String tel;	//null
	// ������ �޼ҵ� : ������ �ڵ� �߰�(JVM)
	//				��Ӱ��谡 �ƴ� ���� �߰����ش�.
	MethodTest(){}	// �ʿ��ϵ� �� �ϵ� �ϳ� �־��ش� ���� ���� �Ϸ���
	MethodTest(String tel){	// ��������
		System.out.println("����ó:"+tel);
	}
	// MethodTest(String name){}
	// ������ �޼ҵ带 ���� �� ���� ���� ������ ���� �������� �� ���� �� ��(������ Ÿ�԰� ���� ������ ������ �� ��)
	MethodTest(int num){}
	MethodTest(int num, String name){
		// this : ���簴ü (����Ŭ����)
		this.num = num;	// ������� = ��������;
		this.name = name;
		String tel ="12345";
		this.tel = "02-1234-1234";	// this�� ���������� �־�߸� ����.
	}
	MethodTest(String name, int num){ // ���� �ٲ�� ����, ������ ���� ���� �߿�
		// ������ �޼ҵ忡�� �ٸ� ������ �޼ҵ� ȣ���ϱ�
		// �޼����(��1, ��2,..);
		// �����ڸ޼ҵ忡�� �ٸ� �����ڸ� ȣ���� ���� �޼������ ���� ǥ���� �� ����
		// this()
		//MethodTest(num, name);	// X �޼���� ���� ǥ���ؼ� ����
		// this() �̿��Ͽ� �ٸ� ������ �޼ҵ带 ȣ���� ���� �ݵ�� ù ��° ���๮�̾�� ��
		//System.out.println(); // �տ� �ٸ� ���๮ ������ ������..
		this(num, name); //���� �ִ� ������ ȣ���� ��, num, name ���� �ٲٸ� ������
	}
	
	
}

