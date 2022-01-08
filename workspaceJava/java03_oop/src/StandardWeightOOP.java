import java.util.Scanner;
public class StandardWeightOOP {
	int age;
	int gender;
	double height;
	double weight;
	double idx = 0.90;
	String sWeightMsg = "";
	
	
	public StandardWeightOOP() {}
	
	// �� �Է� �ޱ�
	void scanWeight() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����= ");
		age = scan.nextInt();
		System.out.print("����(1.����, 2.����)= ");
		gender = scan.nextInt();
		System.out.print("Ű= ");
		height = scan.nextDouble();
		System.out.print("����ü��= ");
		weight = scan.nextDouble();
	}
	
	// ǥ�� ü��
	double sWeight() {
		if(age<=35 && gender==2)
			idx = 0.85;
		else if(age>=36 && gender==1)
			idx = 0.95;
		
		return (height-100)*idx;
	}
	
	// ǥ��ü������
	double sWeightIndex() {
		return (weight/sWeight())*100;
	}
	
	// ǥ��ü������ �򰡱���
	void sWeightTxt() {
		if(sWeightIndex()<=85){
			sWeightMsg = "������";	
		} else if(sWeightIndex()<=95){
			sWeightMsg = "���ݸ�����";	
		} else if(sWeightIndex()<=115){
			sWeightMsg = "ǥ����";	
		} else if(sWeightIndex()<=125){
			sWeightMsg = "���ݺ���";	
		} else{
			sWeightMsg = "����";
		}
	}
	
	// ���
	void result() {
		scanWeight();
		//sWeight();	// ������ �־ ������ �� �ϸ� �����ϰ� �׳� ���ϰ��� ���ư�. ������ �ϵ���, �Ʒ� ���� ���ؼ� ������ ������ ���⼭ �� �� �� �� �ᵵ ��.
		//sWeightIndex();
		sWeightTxt();
		System.out.printf("ǥ��ü��=%.2f\n", sWeight());
		System.out.printf("����� ǥ��ü�������� %.2f���� %s�Դϴ�.\n", sWeightIndex(), sWeightMsg);
	}
}	