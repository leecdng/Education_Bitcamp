import java.util.Scanner;
public class ArrayScore {
	// ���� �غ��� ���� ��..^^

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л� �� = ");
		int student = scan.nextInt();
		
		int cnt = 0;
		int school[][]=new int[student][7];
		
		do {
			System.out.print("�̸� = ");
			int name = scan.nextInt();
			System.out.print("���� = ");
			int kor = scan.nextInt();
			System.out.print("���� = ");
			int eng = scan.nextInt();
			System.out.print("���� = ");
			int math = scan.nextInt();
			
			int total = kor + eng + math;
			int ave = total/3;
			int ranking=1;
			
			
			school[cnt][0] = name;
			school[cnt][1] = kor;
			school[cnt][2] = eng;
			school[cnt][3] = math;
			school[cnt][4] = total; // ����
			school[cnt][5] = ave;
			school[cnt][6] = ranking;
			
			if(cnt >= student-1) break;
			cnt++;
			
		} while(true);
		
		
		// ������ ������ ����
		for(int j=0; j<school.length; j++) {
			
			for(int i=0; i<student-1; i++) {
				int top[] = new int[7];
				top[j] = school[i][j];
					
				if(school[i][4]<school[i+1][4]) {
					school[i][j] = school[i+1][j];
					school[i+1][j] = top[j];
				}
			}
		}
		
		
		//���
		System.out.println("====================================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("====================================================");
		
		
		// �迭 ���
		for(int sch[] : school ) {
			for( int result : sch) {
				System.out.print(result+"\t");
			}
			System.out.println();
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
	====================
	�̸�	����	����	����	����	���	����
	====================
	ȫ�浿 90	89	90	269	___	1
	�̱浿 90	90	43	223	___ 2
	  :	  :	:	:	:	:	:
	��������__ __ __
	���������__ __ __

*/