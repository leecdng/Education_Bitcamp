class Casting	// ����ȯ.. �ʿ��� �� �˻�
{
	public static void main(String[] args) 
	{
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1; // ������ ����ȯ
		System.out.println(b);	// 1�� double���� ������ 1.0�� ��

		// int c = 1.1;	// ������ ����.
		double d = 1.1;
		int e = (int) 1.1;	// 1.1 -> 1.0 �ս� �Ͼ
		System.out.println(e);

		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());	// String
	}
}