import java.util.Scanner;

class Ex03
{
	public static void main(String[] args) 
	{
		// ���� �� ��
		Scanner scan = new Scanner(System.in);

		for(;;){

			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �簢���� ���� / 2. �簢���� �ѷ� / 3. ����");
			int n = scan.nextInt();

			if(n==3){
				//���α׷� ����
				System.exit(0);
			}

			System.out.print("����(�غ�) : ");
			int width = scan.nextInt();

			System.out.print("����(����) : ");
			int height = scan.nextInt();

			int n1 = width * height;
			int n2 = (width + height) * 2; // 2�� �ѷ�
			int result = (n == 1)? n1 : n2;// 1�� ����

			// �� �� �߰�
			String msg = (n == 1)? "����":"�ѷ�";


			System.out.println("�簢���� " + msg + "�� " + result);
		}
		
		

	}
}



/*
	����
	�޴� ���� (1. �簢���� ����, 2. �簢���� �ѷ�)? 1
	����(�غ�)=
	����(����)=
	�簢���� ���� (�غ� * ����)=

	�޴� ���� (1. �簢���� ����, 2. �簢���� �ѷ�)? 2
	����(�غ�)=
	����(����)=
	�簢���� �ѷ�((����+����)*2) =
*/