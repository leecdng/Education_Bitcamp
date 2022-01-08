import java.util.Scanner;
public class ArrayScoreException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt=1;
		boolean repeat = false;
		do {
			try {
				System.out.print("�л� �� = ");
				cnt = Integer.parseInt(scan.nextLine());
				if(cnt<1 || cnt>1000) { // �л� ���� 1�̸��̰ų� 1000�ʰ���
					throw new Exception();
				}
				repeat = false;
			} catch(Exception e) {
				System.out.println("1~1000������ ���ڸ� �Է����ּ���.");
				repeat = true;	// �ٽ� ó������ �ݺ�
			}
		} while(repeat);
		
		
		// ������ ������ ���� Ȯ��
		String name[] = new String[cnt]; //�л� �̸��� ������ �迭
		int jumsu[][] = new int[cnt+2][6]; // �л� ������ ������ �迭 //+2�� ���� ���� ��� ������
		
		//name[cnt] = "��������";
		//name[cnt+1] = "�������";

		
		//�̸��� ������ �Է� �޾� �迭�� ����
		String title[]={"����", "����", "����"};
		for(int i=0; i<cnt; i++) { //0,1,2,...	-> �� ��ȣ
			System.out.print("�̸� = ");
			name[i] = scan.nextLine();
			for(int j=0; j<title.length; j++) { // 0,1,2 -> �� ��ȣ
				try {
					System.out.print(title[j]+" = ");
					jumsu[i][j] = Integer.parseInt(scan.nextLine());
					if(jumsu[i][j] <0 || jumsu[i][j] >100) {	// ������ 0~100���̰� �ƴϸ� ���� �߻�
						throw new NumberFormatException();
					}
				} catch(NumberFormatException nfe) {
					System.out.println("�߸� �Է��Ͽ����ϴ�. 1~100������ ������ ������ �ٽ� �Է����ּ���.");
					j--;	// �ٽ� �ݺ��ؼ� �ش� ������ ������ �Է��ϰ� �ϱ�
				}
				
			}
		}
		
		// ���κ� ����, ���
		// ���� ����
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<3; j++) {
				jumsu[i][3] += jumsu[i][j]; //���κ� ����
				jumsu[cnt][j] += jumsu[i][j]; // ���� ����
			}
			// ���κ� ���
			jumsu[i][4] = jumsu[i][3]/3;
		}
		//���� ���
		for(int i=0; i<3; i++) {
			jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
		}
		
		
		// ���� ���ϱ�
		for(int i=0; i<cnt; i++) {	// 0,1,2,...,9
			// i�� ���� ���� ��ġ
			//jumsu[i][5] = 1;
			for(int j=0; j<cnt; j++) {
				if(jumsu[i][3] < jumsu[j][3]) {
					jumsu[i][5]++;	// ������ ������ ū �л��� ����ŭ ǥ�� = ���
				}
			}
			jumsu[i][5]++;
		}
		
		//���� ������ ���ϱ�
		for(int i=0; i<cnt-1; i++) {
			for(int j=0; j<cnt-1; j++) {
				if(jumsu[j][5] > jumsu[j+1][5]) {
					// ��ȯ
					// �̸� �ٲٱ�
					String nameTemp = name[j];
					name[j] = name[j+1];
					name[j+1] = nameTemp;
					for(int k=0; k<jumsu[j].length; k++) { //0,1,2,3,4,5
						int temp = jumsu[j][k];
						jumsu[j][k] = jumsu[j+1][k];
						jumsu[j+1][k] = temp;
					}
				} //if
			}
		}
		
		

		// =======���==========
		System.out.println("====================================================");
		System.out.println("�̸�\t ����\t����\t����\t����\t���\t����");
		System.out.println("====================================================");
		
		for(int i=0; i<cnt; i++) {
			// �̸� ���
			if(name[i].length()>4) { // �̸��� 4���� ������ �̸��� 4����+..���� ǥ���ϱ�
				name[i] = name[i].substring(0,4)+"..";
			}
			System.out.print(name[i]+"\t ");
			// ���� ��� ����, ����, ����, ����, ���
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println();
		}
		
		// ���� ����
		System.out.print("����\t ");
		for(int i=0; i<3; i++) {	// 0,1,2
			System.out.print(jumsu[cnt][i]+"\t");
		}
		System.out.println();
		// ���� ���
		System.out.print("���\t ");
		for(int i=0; i<3; i++) {
			System.out.print(jumsu[cnt+1][i]+"\t");
		}
		System.out.println();

	}

}

/*
	�л� ���� �Է� �޾� �̸���, �� ������ ������ �Է� ���� ��
	�� �л��� ����, ���, ����, ���� ����, ����� ���Ͽ� ���������� ����϶�.
	
	����
	�л���=3
	�̸�=ȫ�浿
	����=90
	����=89
	����=90
	�̸�=�̱浿
	����=90
	����=90
	����=43
	:
	:
	====================
	�̸�	����	����	����	����	���	����
	====================
	ȫ�浿 90	89	90	269	___	1
	�̱浿 90	90	43	223	___ 2
	  :	  :	:	:	:	:	:
	��������__ __ __
	���������__ __ __

*/