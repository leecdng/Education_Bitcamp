									// �߻�Ŭ���� ���
public class AbstractTestMain extends AbstractTest {

	public AbstractTestMain() {
		
	}
	
	// ��ӹ��� �߻�Ŭ���� ���� ��� �߻�޼ҵ带 �������̵� �Ѵ�.
	// �������̵� �� �� �߻�޼��� ǥ�� �� ��. ���๮ ������ �߻�޼��� �ƴ�.
	public void print() {
		System.out.println("num="+num+", name="+name);
	}
	
	public void setData(int num, String name) {	// �������̵� �� �� �Ű����� Ÿ��, ������ ���ƾ� �ϰ� �������� �޶� ��� ����.
		this.num = num; // super.num = num;
		this.name = name; // super.name = name;
	}

	public void start() {
		//numOutput();
		setData(5000, "�̼���");
		print();
	}
	
	
	public static void main(String[] args) {
		AbstractTestMain am = new AbstractTestMain();
		am.start();
	}

}