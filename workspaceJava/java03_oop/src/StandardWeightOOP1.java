import java.util.Scanner;
public class StandardWeightOOP1 {
	Scanner scan = new Scanner(System.in);
	
	// ������ �Է°� ����
	int age, gender; // 0
	double height, weight; // 0.0
	double sWeight; // ǥ��ü��
	double sWeightIndex; // ǥ��ü������
	String sWeightMsg = "";
	
	StandardWeightOOP1(){}	// �����ڸ޼���
	
	// �������Է� �޼���
	double getConData(String msg) {
		System.out.print(msg+"= ");
		return scan.nextDouble();
	}
	
	void setData() {
		age = (int)getConData("����");
		gender = (int)getConData("���� (1.����, 2.����)");
		height = getConData("Ű");
		weight = getConData("������");
	}
	
	// ǥ��ü�� index ���ϱ� / ǥ��ü�� ���ϱ�
	void setStandardWeight() {
		double index = 0.90;
		if (age<=35 && gender==2) {
			index = 0.85;
		} else if(age>=36 && gender==1) {
			index = 0.95;
		}
		sWeight = (height-100) * index;
	}
	
	// ǥ��ü������ �򰡱���
	void setStandardWeightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		if(sWeightIndex<=85){
			sWeightMsg = "������";	
		} else if(sWeightIndex<=95){
			sWeightMsg = "���ݸ�����";	
		} else if(sWeightIndex<=115){
			sWeightMsg = "ǥ����";	
		} else if(sWeightIndex<=125){
			sWeightMsg = "���ݺ���";	
		} else{
			sWeightMsg = "����";
		}
	}
	
	// ���
	void standardWeightOutput() {
		System.out.println("ǥ��ü��="+sWeight);
		System.out.println("����� ǥ��ü��������"+sWeightIndex+"���� "+sWeightMsg+"�Դϴ�.");
	}
	
	void startStandard() {
		setData();
		setStandardWeight();
		setStandardWeightMsg();
		standardWeightOutput();
	}
	
	
	public static void main(String a[]) {
		StandardWeightOOP1 oop = new StandardWeightOOP1();
		oop.startStandard();
	}
}	
