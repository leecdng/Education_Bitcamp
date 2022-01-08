import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
public class LottoOOPCollection1 {
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public LottoOOPCollection1() {}
	
	// 1���� ����� + ���ʽ� ����, �ߺ��˻�
	public void lottoCreate(int i) {
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num=0;
		while(lotto.size()<7) {
			// �ζǹ�ȣ ����
			num = random.nextInt(45)+1;
			lotto.add(num);
		}
		// lotto TreeSet ��ȣ 7���� �ְ�, num���� ���������� ���� ��ȣ�� �ִ�.
		// bonus ��ȣ�� �ζ� ��ȣ���� �����. TreeSet ��ȣ 6���� �ִ�.
		lotto.remove(num);
		
		lottoPrint(i, lotto.toString(), num);
	}
	

	
	
	// ��� (+����)
	public void lottoPrint(int cnt, String lotto, int bonus) {
		System.out.print(cnt+"���� = ");
		System.out.print(lotto); // ��ȣ
		System.out.println(", ���ʽ� "+bonus);
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
					lottoCreate(i); // ���
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
		LottoOOPCollection1 oop = new LottoOOPCollection1();
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

