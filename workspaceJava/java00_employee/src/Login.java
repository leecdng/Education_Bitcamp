
public class Login {
	private final String USERID = "admin";
	private final String USERPWD ="1234";
	
	public Login() {
		
	}
	// �α��� üũ ���� (true: �α��� ����, false: �α��� ����)
	public boolean loginCheck (String userid, String userpwd) {
		if(userid.equals(USERID) && userpwd.equals(USERPWD)) {
			// �α��� ����
			return true;
		} else {
			return false;
		}
	}
	

}