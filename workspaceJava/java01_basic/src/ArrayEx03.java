import java.util.Scanner;
public class ArrayEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			// �� �Է¹ޱ�
			System.out.print("�ݾ��� �Է��ϼ���? ");
			int money = scan.nextInt();
			
			int won[][] = new int[10][2];
			// ȭ�� ���� �迭 �����
			int d = 5;
			for(int r=0; r<won.length; r++) {
				//for(int c=0; c<won[r].length; c++) {
					won[r][0] = 50000;
					if(r>0) {
						won[r][0] = won[r-1][0]/d;
						if(d == 5) {
							d = 2;
						}else {
							d = 5;
						}
					}
				//}
			}


			for(int r=0; r<won.length; r++) {
				won[r][1] = money/won[r][0];
				money = money%won[r][0];
				//won[r][1] = money/won[r][0];	// �� ���� �ٲ�� 0��������..???
												// ---> �̹� �۾��� �ݾ��� ū ���� ���� ȭ��� ���� ���� ���Ϸ��� �ؼ� 0 ���Դ� ��
				if(won[r][1]>0) {
					if(won[r][0]>=1000) {
						System.out.println(won[r][0]+"��= "+won[r][1]+"��");
					}
					else{
						System.out.println(won[r][0]+"��= "+won[r][1]+"��");
					}
				}
			}
			
			// ������ ����
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�) ");
			int data = scan.nextInt();
			if(data==2) break;
			
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