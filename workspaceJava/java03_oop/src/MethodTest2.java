
public class MethodTest2 {
	// ����
	boolean power = false; // true:����, false:����
	// ä��
	// 	���ȭ : �� �� ���ԵǸ� ���� �� ���� ����
	// �������� ���ʿ� final Ű���带 ����
	// ���ȭ�� ������ ��� �������� �빮�ڷ� ǥ���Ѵ�.
	final int CHANNEL_MIN = 1;
	final int CHANNEL_MAX = 20;
	int channelNow = 11;
	
	public MethodTest2() {
		
	}
	// �޼��� ���� ��Ģ
	//��ȯ�� �޼����(�Ű�����, �Ű�����, ...){
	//	���๮; // ��ɱ���
	//}
	// �޼����: �ҹ��ڷ� ����, �ռ����� ��� �� ��° �ܾ���� �빮�ڷ� ����, ()�� �ִ�.
	
	// power��ư�� ���� ���
	void powerStart() {
		power = !power;	// if������ �� �ᵵ ǥ�� ����
		/*
		if(power) {	// power = false�ϱ� else�� ����
			power = false;
		} else {
			power = true;
		}
		*/
		System.out.println("power="+power);
	}
	// ���� �Է��ϸ� �������� ���Ͽ� ��ȯ�ϴ� �޼��带 ����
	String gugudan(int dan){
		// ��ȯ��: ���๮ 1���� ��������.
		String result ="";
		for(int i=2; i<10; i++) {
			result += dan+"*"+i+"="+dan*i+"\n";	// +=�ؾ� 2~9���ϱ���� ����, =���ϸ� 9���� �͸� ����
		}
		
		return result;
	}
	// ä�� ��ȣ �ø���
	void channelUp() {
		if(channelNow == CHANNEL_MAX) {
			channelNow = CHANNEL_MIN;
		} else {
			channelNow++;
		}
		channelPrint(); // ���� Ŭ������ �ٸ� �޼ҵ� ȣ��
	}
	// ä�� ��ȣ ������
	void channelDown() {
		if(channelNow == CHANNEL_MIN) {
			channelNow = CHANNEL_MAX;
		} else {
			channelNow--;
		}
		channelPrint(); // ���� Ŭ���� ���� �ٸ� �޼ҵ� ȣ��
	}
	// ä�ι�ȣ ����ϴ� �޼ҵ�
	void channelPrint() {
		System.out.println("ä�ι�ȣ: "+channelNow);
	}
	// static Ű����
	static void sum(int max) {
		int tot=0;
		for(int i=1; i<=max; i++) {
			tot+=i;
		}
		System.out.println("1~"+max+"�� ����"+tot);
	}
}