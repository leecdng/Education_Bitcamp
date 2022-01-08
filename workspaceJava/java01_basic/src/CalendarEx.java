import java.util.Scanner;
import java.util.Calendar;

class CalendarEx
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		System.out.print("���� = ");		//�Է°� �޾ƿ���
		int dataYear = scan.nextInt();
		System.out.print("�� = ");
		int dataMonth = scan.nextInt();

		System.out.printf("\t \t %d�� %d��\n\n", dataYear, dataMonth);	// xxxx�� xx��
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");	// ���� ���

		int dataDay = 1;
		cal.set(dataYear, dataMonth-1, dataDay);	// xxxx�� xx�� 1�Ϸ� ����

		//int year = cal.get(Calendar.YEAR);		// �� �ҷ����� // ����, ��, ��, ����
		//int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//���
		for(int i=1; i<=6; i++){	// 6��
			int j=1;
			if(i==1){	// 1�� ��
				for(int s=1; s<=week-1; s++){	// 1���� ���� �պκ��� ����
					System.out.print("\t");
				}
				for(j=1; j<=7-(week-1); j++){	// ������ ������ ������ ����ŭ�� 1�Ϻ��� ���
					if(dataDay<=31){
						System.out.print(dataDay+"\t");
						dataDay++;
					}
				}
			}else{	//2~6�� ��
				for(j=1; j<=7; j++){	// ���� 7��
					cal.set(dataYear, dataMonth-1, dataDay);	// �ϳ��� �þ dataDay�� ���� ����
					day = cal.get(Calendar.DAY_OF_MONTH);	// �ش� ������ �ҷ�����

					if(dataDay<=31 && dataDay==day){	// 31�ϱ��� �� ���� �����Ϳ� �ִ� ���� ���
						System.out.print(dataDay+"\t");
					}
					else break;	// 31�� �Ѱų� ���� �����Ϳ� ���� ��¥�� ����
					
					dataDay++;

				} //for
			} //if-else
			System.out.println();	// �ٹٲ�
		} //for
		//System.out.println(cal);
	} //main
} //class