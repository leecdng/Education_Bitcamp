import java.util.ArrayList;
import java.util.List;

public class CollectionData {

	public CollectionData() {
		
	}
	public List<MemberVO> getMember() {
		// ArrayList에서 사원정보를 담아서 리턴하는 메서드
		// ArrayList<MemberVO> al = new ArrayList<MemberVO>();	// MemberVO타입만 추가 가능한 메서드, 다른 타입 넣으면 오류
		List<MemberVO> al2 = new ArrayList<MemberVO>();
		
		al2.add(new MemberVO("AAAA","기획부","2021-05-10",5000));
		al2.add(new MemberVO("BBBB","총무부","2021-01-01",6000));
		al2.add(new MemberVO("CCCC","인사부","2020-10-10",7000));
		al2.add(new MemberVO("DDDD","총무부","2021-02-02",5500));
		al2.add(new MemberVO("EEEE","인사부","2021-03-02",6500));
		
		return al2;
		
	}

}
