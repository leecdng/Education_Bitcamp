import java.util.Scanner;
public class ArrayScore2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л� �� = ");
		int cnt = Integer.parseInt(scan.nextLine());
		
		// �迭 �����
		String nameList[] = new String[cnt];
		int jumsu[][] = new int[cnt][6];		// +2�� ���� ����, ��� �ڸ�
		
		int n = 0;
		// �� �ݺ��ؼ� �Է¹ޱ� + ���� �迭�� �����ϱ�
		do {			
			// �� �Է� �ް� �ٷ� �迭�� �־��ֱ�
			System.out.print("�̸� = ");
			String name = scan.nextLine(); 
			nameList[n] = name;
			
			System.out.print("���� = ");
			int kor = Integer.parseInt(scan.nextLine());
			System.out.print("���� = ");
			int eng = Integer.parseInt(scan.nextLine());
			System.out.print("���� = ");
			int math = Integer.parseInt(scan.nextLine());
			
			jumsu[n][0] = kor;	// ���� ����
			jumsu[n][1] = eng;	// ���� ����
			jumsu[n][2] = math;	// ���� ����
			
			/*
			String title[] = {"����","����","����"};
			for(int i=0; i<3; i++) {
				System.out.print(title[i] + "= ");
				jumsu[cnt-1][i] = Integer.parseInt(scan.nextLine());
			}
			*/
			for(int i=0; i<3; i++) {
				jumsu[n][3] += jumsu[n][i]; // ���κ� ����
			}
			jumsu[n][4] = jumsu[n][3] / 3; // ���κ� ���
			
			n++;
		} while(n<cnt);
		
		// ���� ���ϱ�
		for(int i=0; i<cnt; i++) {
			jumsu[i][5] = 1;
			for(int j=0; j<cnt; j++) {
				if(jumsu[i][3]<jumsu[j][3]) {
					jumsu[i][5]++;
				}
			}
		}
		
		// ���� ������ �����ϱ� // ���� ���� �� �� �غ���
		for(int i=0; i<cnt-1; i++) {
			// �����ϱ�
			for(int j=0; j<cnt-1; j++) {
				if(jumsu[j][5]>jumsu[j+1][5]) {
					String nameTemp = nameList[j];
					nameList[j] = nameList[j+1];
					nameList[j+1] = nameTemp;
					for(int k=0; k<jumsu[i].length; k++) {
						int temp= jumsu[j][k];
						jumsu[j][k] = jumsu[j+1][k];
						jumsu[j+1][k] = temp;
					}
				}
			}
		}
		
		
		// ����ϱ�
		System.out.println("====================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("====================================================");
		
		for(int i=0; i<cnt; i++) {	
			System.out.print(nameList[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		int sum[]=new int[3];
		int ave[]=new int[3];
		System.out.print("��������\t");
		for(int j=0; j<3; j++) {
			for(int i=0; i<cnt; i++) {
				sum[j] += jumsu[i][j];
			}
			System.out.print(sum[j]+"\t");
		}
		System.out.println();
		
		System.out.print("�������\t");
		for(int i=0; i<3; i++) {
			ave[i]=sum[i]/cnt;
			System.out.print(ave[i]+"\t");
		}
		

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
	===========================
	�̸�	����	����	����	����	���	����
	===========================
	ȫ�浿 90	89	90	269	___	1
	�̱浿 90	90	43	223	___ 2
	  :	  :	:	:	:	:	:
	��������__ __ __
	���������__ __ __

*/