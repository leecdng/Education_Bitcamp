
public class MemberVO {
	// 1���� ���ڵ带 ������ ������ �����ϴ� Ŭ����
	// ��������� ĸ��ȭ(private)�Ѵ�. // �޼��带 ���ؼ��� �����ϰԲ�
	private String name;
	private String depart;
	private String hire;
	private int sal;
	
	public MemberVO() {
		
	}
	public MemberVO(String name, String depart, String hire, int sal) {
		this.name = name;
		this.depart = depart;
		this.hire = hire;
		this.sal = sal;
	}
	
	// ĸ��ȭ �� ����� ������ �� �ִ� �޼��� ����
	//			set���������
	public void setName(String name) { // ������ ������
		this.name = name;
	}
	public String getName() { // �����͸� ������
		return name;
	}
	
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getDepart() {
		return depart;
	}
	
	public void setHire(String hire) {
		this.hire=hire;
	}
	public String getHire() {
		return hire;
	}
	
	public void setSal(int sal) {
		this.sal=sal;
	}
	public int getSal() {
		return sal;
	}
	
	////////////////////
	// ��� �޼���
	public void memberPrint() {
		System.out.println("�̸�="+name);
		System.out.println("�μ���="+depart);
		System.out.println("�Ի���="+hire);
		System.out.println("�޿�="+sal);
	}
	
	// ����Ŭ������ Object�� toString() �޼��带 �������̵�
	public String toString() {
		String memberData = name+", "+depart+", "+hire+", "+sal;
		
		return memberData;
	}

}