import java.util.Scanner;
public class ArrayEx03_2 {	// ������ ��

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		do {
			
			// �� �Է¹ޱ�
			System.out.print("�ݾ��� �Է��ϼ���? ");
			int money = scan.nextInt();
			
			// ȭ�� ����
			// ȭ�� ������ ������ 2������ ��ȭ�Ͽ� �����Ѵ�.
			int result[][]= {
					{50000,0}, {10000, 0}, {5000, 0}, {1000, 0}, {500, 0},
					{100, 0}, {50, 0}, {10, 0}, {5, 0}, {1, 0}
			};

			//ȭ����� ���
			for(int row=0; row<result.length; row++) { //0,1,2,3,4...,9
				result[row][1]=money / result[row][0]; //ȭ�� ����
				money-=result[row][0]*result[row][1]; // ���� ������ ȭ��ݾ׸�ŭ ����
			}
			
			//���
			for(int row=0; row<result.length; row++) {
				if(result[row][1]>0) {
					System.out.print(result[row][0]+"="+result[row][1]);
					if(result[row][0]>=1000) {
						System.out.println("��");
					}else {
						System.out.println("��");
					}
				}
			}
			
			// ������ ����
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�) ");
			if(scan.nextInt()==2) break;
			
		} while(true);

	}

}

/*
�迭�� �̿��Ͽ� �����....^^

50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
 
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