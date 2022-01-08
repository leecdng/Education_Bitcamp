import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack�� ���� �Էµ� ������ ���߿� ��µȴ�. (FILO: first in last out ��������)
		// Queue: (FIFO ���Լ���)
		// push: �Է�, pop:���
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("ȫ�浿");
		stack.push("�������");
		stack.push("�̼���");
		stack.push("������");
		
		// empty() : stack�� ��ü�� ������ false, ��ü�� ���� �� true
		while(!stack.empty()) {
			String name = stack.pop();	// �������� �Է��� ������ ���� ���� ����
			System.out.println(name);
		}
		
		
	}

	public static void main(String[] args) {
		new StackTest();

	}

}