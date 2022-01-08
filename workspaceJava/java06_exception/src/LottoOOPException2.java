import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class LottoOOPException2 {
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public LottoOOPException2() {}
	
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
	public int doubleCheck(int lotto[], int i) {
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
			} else {
				System.out.print("����Ͻ÷��� Y��, �����Ͻ÷��� N�� �����ּ���. ");
			}
		}while(true);
	}
	
	public void lottoStart() throws NumberFormatException{
		do {
			System.out.print("���� �� = ");
			int game = Integer.parseInt(scan.nextLine());
			if(game>=1 && game<=10000) {	// 1~10000������ �� �־��� ���� ���� ����
				// ����
				for(int i=1; i<=game; i++) {
					int lotto[] = lottoCreate();
					Arrays.sort(lotto, 0, 6); // ����
					lottoPrint(i, lotto); // ���
				} //for
			} else {	// 1~10000������ ���� �ƴ� �ٸ� ���� �־��� ��� ���� �߻�
				throw new NumberFormatException();
			} // if
			// ��� ����
			if(!yesNo()) {
				break;
			}
		}while(true);
	}
	
	
	
	
	// ���� �޼���
	public static void main(String[] args) {
		LottoOOPException2 oop = new LottoOOPException2();
		boolean repeat = false;
		do {
			try {
				oop.lottoStart();
				repeat = false;
			} catch(NumberFormatException ne) {	// int�� �ƴ� �ٸ� ���� �Է� or ���ڸ� �ʹ� ��� or 0�Ǵ� ����, 10000�ʰ� ���� �־��� ���
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~10000������ ���ڸ� �Է� �����մϴ�.");
				repeat = true;	// �ٽ� ó������ �ݺ�
			}
		} while(repeat);
	}

}

