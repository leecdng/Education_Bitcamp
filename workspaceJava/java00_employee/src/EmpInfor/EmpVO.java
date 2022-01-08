package EmpInfor;

public class EmpVO {
	private String empNo; // �����ȣ - �׳� String���� �ϱ�
	private String empName; // �����
	private String tel; // ����ó
	private int sal; // �޿�
	private String hiredate; // �Ի���
	
	public EmpVO() {
		
	}
	
	// �ʿ��� ���� �� ��� ������ �� �ְ� �ص� ��. �����ȣ, �̸�, ����ó�� �־ ��.
	public EmpVO(String empNo, String empName, String tel, int sal, String hiredate) {
		this.empNo = empNo;
		this.empName = empName;
		this.tel = tel;
		this.sal = sal;
		this.hiredate = hiredate;
	}
	
	// ��� 1�� ���
	public void empPrint() {
		System.out.printf("%10s %10s %20s %9d %13s\n", empNo, empName, tel, sal, hiredate);
	}
	
	// Ÿ�̺� ���
	public static void titlePrint() {
		System.out.printf("%9s %9s %15s %11s %10s\n", "�����ȣ", "�����", "����ó", "�޿�", "�Ի���");
		System.out.println("---------------------------------------------------------------------");
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	

}