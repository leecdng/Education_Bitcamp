import java.util.Scanner;

class ScannerTest 
{
	public static void main(String[] args) 
	{
		// Scanner : �ֿܼ��� ���� �Ǵ� ���� �Ǽ� ���� �Է¹޴� Ŭ����
		// 1. ��ü�� ����
		// ���۷��� ���� : Ŭ������ ������ ����� ��?
		Scanner scan = new Scanner(System.in);


		// 2. �� �Է� �޴� �޼ҵ带 ȣ���Ѵ�.
		// ��ü��.�޼ҵ�()
		// nextInt() : ������ �Է�, nextDouble() : �Ǽ��� �Է�, next() : 1���� �ܾ ���ڿ��� �Է�
		// nextLine() : �� ���� ���ڿ��� �Է�
		
		
		
		//int num = scan.nextInt();	// ���� �Է��ϰ� ���͸� �ľ� ������????????

		//System.out.println("num =" + num);
		
		
		
		System.out.print("���� = ");
		String a = scan.nextLine();
		
		System.out.print("���� = ");
		int n = Integer.parseInt(scan.nextLine());
		
		System.out.println();
		
	}
}