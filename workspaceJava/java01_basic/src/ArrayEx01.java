import java.util.Scanner;
public class ArrayEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// �迭�� �̿��ϴ� ����
		// 7������ ������ �Է¹޾� ������ ����� ���϶�.
		// ����, ����, ����, ����, ����, �ѱ���, ����
		
		// ��������� ���� �����͸� �迭�� ����
		String[] title= {"����","����","����","����","����","�ѱ���","����"};
		// �� ������ ������ ������ ������ �迭
		int jumsu[] = new int[7]; //0, 0, 0, 0, 0, 0, 0 --> 0�� 7�� �������
		
		int sum = 0;
		// ���� �Է�
		for(int idx=0; idx<title.length; idx++) {
			System.out.print(title[idx]+"="); // ����=
			jumsu[idx] = scan.nextInt();
			//����
			sum = sum + jumsu[idx];
			
		}
		System.out.println("����="+sum);
		System.out.println("���="+(double)(sum/title.length));
		

	}

}