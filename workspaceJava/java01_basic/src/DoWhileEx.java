import java.util.Scanner;

class DoWhileEx 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		int data = 0;	// �ٽ� �����ϳİ� ������ �� �Է°�

		do{
			System.out.print("�ݾ��� �Է��ϼ���. : ");
			int money = scan.nextInt();
			
			int won=50000; // 50000 10000 5000 1000...	// ȭ�� ����
			int r=0; // ȭ�� �� ��
			do{
				int i =1;
				while(i<=10){	// ȭ�� ���� �� 10����
					if(i==1){	// ���� ū �������� 1��°�� ������
						won=50000;		// won = ���� ū ���� 50000
					}else if(i%2==0){	// 2�� °����(¦�� ���� ��)�� ȭ�����/5
						won/=5;		// 10000, 1000, 100, 10, 1
					}else{	// 3�� °����(Ȧ�� ���� ��)�� ȭ�����/2
						won/=2;	// 5000, 500, 50, 5
					}

					i++; // �� 10�� ���� �س���

					r = money/won;	// ȭ�� �� �� = �ݾ�/ȭ�����
					money %= won;	// �ݾ� = �ݾ��� ȭ������� ���� ������ �ݾ�
					
					if(r!=0){	// ȭ�� �� ���� 0�� �ƴ� ���� ���
						if(won>=1000){	// ����� ��
							System.out.printf("%d�� = %d��\n", won, r);
						} else{	// ������ ��
							System.out.printf("%d�� = %d��\n", won, r);
						} //if
					}//if
				}//while

			}while(money > 0);	// ���� �ݾ��� 0���� ũ�� (0���� �ƴϸ�) ��� ���� // 0�� �Ǹ� ����.
			//do-while

			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�) : ");
			data = scan.nextInt();

		}while(data==1); // do-while
	} // main
} // class

/*
	����
	�ݾ��� �Է��ϼ���? 126300
	50000��=2��
	10000��=2��
	5000��=1��
	1000��=1��
	100��=3��
	�ٽ� �Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�) : 1

	�ݾ��� �Է��ϼ���? 5435
	5000��=1��
	100��=4��
	10��=3��
	1��=5��
	�ٽ� �Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�) : 2
*/