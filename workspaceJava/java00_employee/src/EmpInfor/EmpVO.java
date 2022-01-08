package EmpInfor;

public class EmpVO {
	private String empNo; // 사원번호 - 그냥 String으로 하기
	private String empName; // 사원명
	private String tel; // 연락처
	private int sal; // 급여
	private String hiredate; // 입사일
	
	public EmpVO() {
		
	}
	
	// 필요한 정보 다 없어도 세팅할 수 있게 해도 됨. 사원번호, 이름, 연락처만 있어도 됨.
	public EmpVO(String empNo, String empName, String tel, int sal, String hiredate) {
		this.empNo = empNo;
		this.empName = empName;
		this.tel = tel;
		this.sal = sal;
		this.hiredate = hiredate;
	}
	
	// 사원 1명 출력
	public void empPrint() {
		System.out.printf("%10s %10s %20s %9d %13s\n", empNo, empName, tel, sal, hiredate);
	}
	
	// 타이블 출력
	public static void titlePrint() {
		System.out.printf("%9s %9s %15s %11s %10s\n", "사원번호", "사원명", "연락처", "급여", "입사일");
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
