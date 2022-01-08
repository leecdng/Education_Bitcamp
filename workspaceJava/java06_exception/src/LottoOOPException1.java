import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class LottoOOPException1 {	// ������ ��
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public LottoOOPException1() {}
	
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
				return true;
			} else if(qa.equalsIgnoreCase("n")) {
				return false;
			}
		}while(true);
	}
	
	public void lottoStart() {
		do {
			try {
				System.out.print("���� �� = ");
				int game = Integer.parseInt(scan.nextLine());
				// ����
				for(int i=1; i<=game; i++) {
					int lotto[] = lottoCreate();
					Arrays.sort(lotto, 0, 6); // ����
					lottoPrint(i, lotto); // ���
				}
				// ��� ����
				if(!yesNo()) {
					break;
				}
			} catch(NumberFormatException nfe) {
				System.out.println("���� ���� ���� �������� �մϴ�.");
			}
		}while(true);
	}
	

	
	
	
	// ���� �޼���
	public static void main(String[] args) {
		LottoOOPException1 oop = new LottoOOPException1();
		oop.lottoStart();
	}

}

