import java.util.Scanner;
public class Lotto1 {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("���� �� = ");	// ���� �� �Է�
			int cnt = scan.nextInt();
			
			// �Է¹��� ���� ����ŭ ���� �����
			for(int game=1; game<=cnt; game++) {	// �Է��� ���� ����ŭ �ݺ�
				// ���� 1�� �����
				int[] lotto = new int[7];	// �ζ� �迭
				for(int i=0; i<lotto.length; i++) { //lotto[0]~lotto[lotto.length-1] ���� �ݺ�
					lotto[i] = (int)(Math.random()*45)+1;	// 1~45���� ���� �� ���� ���ϱ�

					// �ߺ��˻�
					for(int c=0; c<i; c++) {
						if(lotto[i]==lotto[c]) {
							i--;
						}
					}
				}
				
				// ����
				for(int i=0; i<lotto.length-2; i++) { //0,1,2,3,4
					for(int j=0; j<lotto.length-2-i; j++) {
						if(lotto[j]>lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
				}
				
				// ���
				System.out.print(game + "����=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i] + ", ");
				}
				System.out.println("���ʽ� " + lotto[6]);
				
			} //for
				
			
			System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)? ");
			int check = scan.nextInt();
			if (check==2) break; // �ݺ��� �ߴ�
			
		} while(true);	//do-while
		
	} //main
} //class
/*
	�ζ� ��ȣ : 1~45���� ��ȣ 6��
			 ���ʽ� 1��
			 
	����
	���Ӽ� = 3
	1���� = 5,13,26,32,33,45, ���ʽ� 11
	2���� = 5,13,26,32,33,45, ���ʽ� 11
	3���� = 5,13,26,32,33,45, ���ʽ� 11
	����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)? 1
	
	���Ӽ� = 3
	1���� = 5,13,26,32,33,45, ���ʽ� 11
	2���� = 5,13,26,32,33,45, ���ʽ� 11
	3���� = 5,13,26,32,33,45, ���ʽ� 11
	4���� = 5,13,26,32,33,45, ���ʽ� 11
	5���� = 5,13,26,32,33,45, ���ʽ� 11
	����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)? 2
	
	����: �ߺ��Ǹ� �� ��.
	
*/