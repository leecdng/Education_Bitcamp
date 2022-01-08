import java.util.Scanner;
import java.util.Arrays;
public class LottoOOP {
	Scanner scan = new Scanner(System.in);
	
	int cnt;	// ���� ��
	int[] lotto = new int[7];	// �ζ� ��ȣ �迭
	
	public LottoOOP() {}
	
	// ���Ӽ� �Է¹ޱ�
	public int inputCount() {		
		System.out.print("���� �� = ");
		return scan.nextInt();
	}
	
	// �ζ� ��ȣ ���� ����
	public int[] lottoNum() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*10)+1;	//1~45 ���� ���ڸ� lotto �迭������ ����
			i = doubleCheck(i);
		}
		return lotto;	// ���� ���ڸ� ���� lotto �迭 ��ȯ
	}
	
	// �ߺ� �˻�
	public int doubleCheck(int i) {
		for(int j=0; j<i; j++) {
			if(lotto[j]==lotto[i]) {
				i--;
				break; // �տ� �̹� �ߺ��� ������ �ݺ��� ���߱�
			}
		}
		
		return i;
	}
	
	
	// �ζ� ��ȣ ���� // Arrays ����
	public void lottoArr(int[] lotto) {
		this.lotto = lotto;
		
		Arrays.sort(lotto, 0, 6);	// lotto �迭�� ���ʽ��� ������ ���ڰ� ���ĵ�
	}
	
	// �ζ� ��ȣ�� ��� (����, �����ϰ� ���)
	public void lottoPrint(int[] lotto) {
		this.lotto = lotto;
		lottoArr(lottoNum()); // �ζ� ��ȣ ����, ����
		for(int j=0; j<lotto.length; j++) {
			if(j==6) System.out.print("���ʽ� " + lotto[j]); 	// ���ʽ� ��ȣ ���
			else System.out.print(lotto[j] + ", ");	// ������ ��ȣ ���
		}
	}
	
	// ���� ����ŭ �ݺ� + �� �������� ����
	public void lottoRepeat(int cnt) {
		this.cnt = cnt;
		cnt = inputCount();	// cnt = �Է� ���� �� (���� ��)
		
		for(int i=1; i<=cnt; i++) {	// ���� ����ŭ �ݺ�
			// �ζ� ��ȣ ���
			System.out.print(i + "���� = ");
			lottoPrint(lotto); // �ζ� ��ȣ ��� �޼��� (����, ����, ���)
			System.out.println(); // �� �ٲ�
		}
	}
	
	// ����ϰڽ��ϱ�? (1.��, 2.�ƴϿ�) ����
	public int inputSelect() {
		System.out.print("����Ͻðڽ��ϱ�? (1.��, 2. �ƴϿ�) = ");
		return scan.nextInt();	// ������ ���ڸ� ��ȯ
	}
	
	// ���� ���� // 1�̸� ��� �ݺ�, 2�� ����
	public void start() {
		do {
		
			lottoRepeat(cnt);	// �ζ� ��ȣ ��� (�Էµ� ����ŭ, ����+���ĵ� �ζ� �迭��)
			if(inputSelect() == 2) break;	// 2�� ��ȯ������ ����
			
		} while(true);
	}
	
	
	
	// ���� �޼���
	public static void main(String[] args) {
		LottoOOP oop = new LottoOOP();
		oop.start();

	}

}



// ���� ����ŭ �ݺ��ؼ� ���
/*
public void lottoPrint(int cnt, int[] lotto) {
	this.cnt = cnt;
	this.lotto = lotto;
	cnt = inputCount();	// cnt = �Է� ���� �� (���� ��)
	
	for(int i=1; i<=cnt; i++) {	// ���� ����ŭ �ݺ�
		// �ζ� ��ȣ ����, ������ ��ȣ �����ϱ�
		lottoArr(lottoNum());
		// �ζ� ��ȣ ���
		System.out.print(i + "���� = ");
		for(int j=0; j<lotto.length; j++) {
			if(j==6) System.out.print("���ʽ� " + lotto[j]); 	// ���ʽ� ��ȣ ���
			else System.out.print(lotto[j] + ", ");	// ������ ��ȣ ���
		}
		System.out.println(); // �� �ٲ�
	} //for
}
*/