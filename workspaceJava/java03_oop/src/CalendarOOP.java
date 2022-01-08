import java.util.Scanner;
import java.util.Calendar;
public class CalendarOOP {
	Calendar cal = Calendar.getInstance();
	
	int dataYear, dataMonth, week, lastDay;
	
	CalendarOOP(){}
	
	// �� �Է��ϱ�
	int getConData(String txt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(txt + " = ");
		return scan.nextInt();
	}
	void scanData() {
		dataYear = getConData("����");
		dataMonth = getConData("��");
	}
	
	// Ķ���� �� �����ϱ�
	void setData() {
		cal.set(dataYear, dataMonth-1, 1);
	}
	
	// ���� ���ϱ�
	void getWeek() {
		week = cal.get(Calendar.DAY_OF_WEEK);
	}
	
	// �޷��� �������� ���ϱ�
	void getLastDay() {
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	// �޷� ���
	void setCalendar() {
		System.out.println("\t\t\t"+ dataMonth +"��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int s=1; s<week; s++) {
			System.out.print("\t");
		}
		for(int d=1; d<=lastDay; d++) {
			System.out.print(d+"\t");
			if((d+week-1)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	// ����
	void calendarPrint() {
		scanData();
		setData();
		getWeek();
		getLastDay();
		setCalendar();
	}
	

	public static void main(String[] args) {
		CalendarOOP oop = new CalendarOOP();
		oop.calendarPrint();
	}
}