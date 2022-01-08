import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class LottoOOPException {	// ������ ��
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public LottoOOPException() {}
	
	// 1���� ����� + ���ʽ� ����
	public int[] lottoCreate() {
		int lotto[] = new int[7];
		for(int i=0; i<lotto.length; i++) {	// 0~6����
			// �ζ� ��ȣ ����
			lotto[i] = random.nextInt(45)+1;
			// �ߺ��˻� �޼��� ȣ��
			i = doubleCheck(lotto, i);
		}
		return lotto;
	}
	
	// �ߺ��˻�
	public int doubleCheck(int lotto[], int i) { // ���� �޼ҵ尡 ����Ǹ� �� �ȿ� �ִ� ������ �Ű������� ���ٰ� ���� �ȴ�..?
		for(int j=0; j<i; j++) { // ���� �迭�� ���� �迭���ϰ��� ��
			if(lotto[j] == lotto[i]) {
				i--;
				break; // �տ� �̹� �ߺ��� ������ �ݺ��� ���߱�
			}
		}
		return i;
	}
	
	// ��� (+����)
	public void lottoPrint(int cnt, int lotto[]) {
		System.out.print(cnt+"���� = ");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6))); // ��ȣ
		System.out.println(", ���ʽ� "+lotto[6]);
	}

	// ��� ���� Ȯ���ϴ� �޼���
	public boolean yesNo() {
		do {
			System.out.print("����Ͻðڽ��ϱ�? (y.��, n.�ƴϿ�) = ");
			String qa = scan.nextLine();
			// y: ���(true), n: ����(false), �� ��: �ٽ� ����
			if(qa.equalsIgnoreCase("y")) {
				return true; // break �� �־ ��ȯ�Ǹ� �ݺ��� ������??????
			} else if(qa.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.print("����Ͻ÷��� Y��, �����Ͻ÷��� N�� �����ּ���. ");
			}
		}while(true);
	}
	
	public void lottoStart() {
		do {
			try {
				System.out.print("���� �� = ");
				int game = Integer.parseInt(scan.nextLine());
				if(game<1 || game>10000) {	// 1�̸��� ������ �־��� ���
					System.out.println("1~10000������ ���ڸ� �Է� �����մϴ�.");
				} else {
					// ����
					for(int i=1; i<=game; i++) {
						int lotto[] = lottoCreate();
						Arrays.sort(lotto, 0, 6); // ����
						lottoPrint(i, lotto); // ���
					} //for
				} // if
				// ��� ����
				if(!yesNo()) {
					break;
				}
			} catch(NumberFormatException ne) {	// int���� �ƴ� �ٸ� ���ڸ� �Է����� ���
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~10000������ ���ڸ� �Է� �����մϴ�.");
			}
		}while(true);
	}
	
	
	
	
	// ���� �޼���
	public static void main(String[] args) {
		LottoOOPException oop = new LottoOOPException();
		oop.lottoStart();
	}

}

