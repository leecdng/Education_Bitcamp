import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		
		Scanner scan = new Scanner(System.in);
		
		int data = 1;
		
		do {
			System.out.print("���� �� = ");	// ���� �� �Է�
			int game = scan.nextInt();
			
			int[] lotto = new int[7];	// �ζ� �迭
			
			for(int i=1; i<=game; i++) {	// �Է��� ���� ����ŭ �ݺ�
				
				System.out.print(i+"���� = ");
				
				// ���� ���� ���ϱ�
				for(int j=0; j<lotto.length; j++) { //lotto[0]~lotto[lotto.length-1] ���� �ݺ�
					int random = (int)(Math.random()*45)+1;	// 1~45���� ���� �� ���� ���ϱ�
					lotto[j] = random;	// �迭�� ���� �ϳ��� �־��ֱ�
					// �ߺ� ���ֱ�
					if(j!=0) {	// lotto[0] ���� �����ϰ� ����
						for(int z=1; z<=j; z++) {
							if(j-z>0 && random == lotto[j-z]) {	//lotto[j]�� ������ ���� ���� �迭���̶� ������
								j--;	// ���� �迭������ �Ѿ�� �� �ϰ� �ϰ� �ٽ� ���� ���ϱ�
							}
						}
					} //if
				} //for
				
				//����
				// lotto.length-1 => ���ʽ� ������ ���� lotto[0]~lotto[5]����
				for(int m=0; m<lotto.length-1-1; m++) {
					for(int n=0; n<lotto.length-1-m-1; n++) {
						if(lotto[n]>lotto[n+1]) {	// ���ؼ�
							int temp = lotto[n];	// ��ȯ�ϱ� (ū ���� �ڷ�)
							lotto[n] = lotto[n+1];
							lotto[n+1] = temp;
						} //if
					} // for
				} //for
				
				// ���
				for(int j=0; j<lotto.length; j++) {
					if(j<lotto.length-1) {
						System.out.print(lotto[j] + ", ");
					} else {
						System.out.print("���ʽ� "+lotto[6]);
					} //if
				} //for
				System.out.println();
			} //for
			System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)? ");
			data = scan.nextInt();
			
		} while(data==1);	//do-while
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