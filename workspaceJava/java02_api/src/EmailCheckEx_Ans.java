import java.util.Scanner;
public class EmailCheckEx_Ans {

	Scanner scan = new Scanner(System.in);
	
	String email = "dddd@sss";
	String id = "";
	String domain ="";
	public EmailCheckEx_Ans() {
		
		
	}
	// �̸��� �Է�
	public void getData() {
		System.out.print("�̸��� �Է� = ");
		
		email = scan.nextLine();
	}
	
	
	// �Ÿ���
	
	
	
	
	// ���
	// ���̵�
	public void idPrint(String email) {
		this.email=email;
		String[] emailArr = email.split("@");
		id = emailArr[0];
		domain = emailArr[1];
		String[] domainArr = emailArr[1].split(".");
		
		//return email;
	}
	
	public void mailCheck() {
		idPrint(email);
		if(emailArr.length>1 || domainArr.length!=2 ) {
			System.out.println("�̸����� �߸� �Է��Ͽ����ϴ�.");
		}
	}
	
	// ������
//	public String domainPrint() {
//		
//	}
	
	
	// ����
	public void startEmailCheck() {
		idPrint(email);
	}

	public static void main(String[] args) {
		EmailCheckEx_Ans emailChk = new EmailCheckEx_Ans();
		
		emailChk.startEmailCheck();

	}

}

/*
����
�̸��� �Է� = goguma@nate
�̸����� �߸� �Է��Ͽ����ϴ�.

�̸��� �Է� = goguma.com@com
�̸����� �߸� �Է��Ͽ����ϴ�.

�̸��� �Է� = goguma.com
�̸����� �߸� �Է��Ͽ����ϴ�.

�̸��� �Է� = goguma777@nate.com
���̵� = goguma777
������ = nate.com

�̸��� �Է� =

*/