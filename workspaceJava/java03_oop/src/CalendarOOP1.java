import java.util.Scanner;
import java.util.Calendar;
public class CalendarOOP1 {	// ������ ��
	Scanner scan = new Scanner(System.in);
	Calendar date;	/////
	
	public CalendarOOP1() {
		calendarStart();
	}
	
	public void calendarStart() {
		// �⵵, ��
		int year = getDate("����");
		int month = getDate("��");
		
		titlePrint(year, month); // ���� ����� �޼ҵ� ȣ��	/////
		
		date = Calendar.getInstance();
		// �Է¹��� ���, 1���� ����
		date.set(year, month-1, 1);
		// ���� ���ϱ�
		int week = date.get(Calendar.DAY_OF_WEEK);
		
		spacePrint(week-1);// ���� ������ �̿��Ͽ� ���� ���
		
		// ���� ����� ��������
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		dayPrint(week-1, lastDay);// ��¥ ���
	}
	// ��¥ ���
	public void dayPrint(int space, int lastDay) {
		for(int day=1; day<=lastDay; day++) {
			System.out.print(day+"\t");
			if((day+space)%7==0) {
				System.out.println();
			}
		}
	}
	
	// 1�� ��� ���� ���� ���
	public void spacePrint(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print("\t");
		}
	}
	
	// Ÿ��Ʋ ���
	public void titlePrint(int year, int month) {
		System.out.println("\t\t"+year+"��"+month+"��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
	}
	//�ֿܼ��� �⵵, ���� �Է¹޴� �޼ҵ�
	public int getDate(String msg) {
		System.out.print(msg+"->");
		return Integer.parseInt(scan.nextLine());
	}
	

	public static void main(String[] args) {
		new CalendarOOP1();	/////
	}

}
/*
 ����� �Է� �޾� �޷� ���
 ������� Scanner, Calendar �����Ѵ�. 
 */
