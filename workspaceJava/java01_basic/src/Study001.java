import java.util.Scanner;

class Study001
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);


		// �簢�� 4*6
		for(int i=1; i<=6; i++){
			for(int j=1; j<=4; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		// ���� ���� �����ﰢ�� 5*5
		for(int i=1; i<=5; i++){ 
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		// ���� ���� �� �����ﰢ�� 5*5
		for(int i=5; i>=1; i--){ 
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// ������ ���� �����ﰢ�� 5*5
		for(int i=1; i<=5; i++){
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// ������ ���� �� �����ﰢ�� 5*5
		for(int i=5; i>=1; i--){
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();


		// �̵�ﰢ�� //1,3,5,7,9...25

		for(int i=1; i<=25; i+=2){ 
			for(int s=1; s<=(25-i)/2; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();


		// �̵�ﰢ���� ���ĺ� �̾�ֱ�

		char c ='A';
		for(int i=1; i<=25; i+=2){
			for(int s=1; s<=(25-i)/2; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(c++);
				if(c=='Z'){
					c='A';	
				}
			}
			System.out.println();
		}
		
		System.out.println();


		// ������ Ȧ�� �Է��ؼ� ���̾Ƹ�� ��� ����� + ���ĺ� �̾�ֱ�
		
		System.out.print("������ Ȧ�� �Է�(1~49) = ");
		int odd = scan.nextInt();
		
		int n = 2;	//�������� ������ �ش�
		char ch = 'A';

		
		for(int i=1; i>0; i+=n){	// i>0 --> i�� 1 ���� ������ ��� ������� ��
			for(int s=1; s<=(odd-i)/2; s++){	//����
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){	//��
				System.out.print(ch++);	//�̾ ��µǰ�
				if(ch>'Z'){		// A~Z������ ��µǰ�
					ch='A';
				}
			} //for
			System.out.println();	//�ٹٲ�

			if(i>=odd){	// i==odd�� �� �� ����
				n= -2;	// �������� ���Ұ����� �ٲٱ�
			}
		} //for




		// �Ʒ� ���ﰢ�� ���̱�
		/*
		for(int i=odd-2; i>=1; i-=n){
			for(int s=1; s<=(odd-i)/2; s++){
				System.out.print(" ");			
			}
			for(int j=1; j<=i; j++){
				if(ch>'Z'){
					ch='A';
				}
				System.out.print(ch++);
			}
			System.out.println();
		}

		*/

	}
}