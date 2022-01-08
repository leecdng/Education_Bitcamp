import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
		// Map 인터페이스를 상속받은 클래스는 key와 value가 존재한다.
		// 1. HashMap은 key와 value 데이터를 저장한다.
		// 2. TreeMap은 key와 value로 데이터르 저장하고, key를 기준으로 정렬된다.
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, new String ("홍길동")); // 객체 추가
		hm.put(100, "세종대왕");
		hm.put(50,  "이순신");
		hm.put(25, "장영실");
		hm.put(33,  "유승룡");
		
		String name = hm.get(100); // int --> Integer
		System.out.println("100-> "+name);
		
		// HashMap에서 Key목록을 구하여 Set에 담아준다.
		Set<Integer> keyList = hm.keySet();
		Iterator<Integer> ii = keyList.iterator();
		
		while(ii.hasNext()) {	// 객체가 있으면 true, 없으면 false
			int k = ii.next();
			System.out.println("key=" + k+", value= " + hm.get(k) );	// 순서 없이 출력됨 set이니까
		}
		
		System.out.println("==============================================");
		HashMap<String, MemberVO> hm2 = new HashMap<String, MemberVO>();
		
		hm2.put("홍길동", new MemberVO("홍길동", "기획부", "2020-10-10", 5000));
		hm2.put("이순신", new MemberVO("이순신", "총괄부", "2020-01-01", 6000));
		hm2.put("장영실", new MemberVO("장영실", "총무부", "2020-07-08", 3000));
		hm2.put("세종대왕", new MemberVO("세종대왕", "인사부", "2020-02-01", 7000));
		hm2.put("유승룡", new MemberVO("유승룡", "기획부", "2020-03-05", 6000));
		
		System.out.println("============ key를 이용 정보 얻어오기 =============");
		// key목록 가져오기
		Set<String> memberKey = hm2.keySet();
		
		// Iterator
		Iterator<String> iii = memberKey.iterator();
		while(iii.hasNext()) {
			String key = iii.next();
			MemberVO value = hm2.get(key);
			// System.out.println(value.toString());
			System.out.print(value.getName());
			System.out.print(", "+ value.getDepart());
			System.out.print(", "+ value.getHire());
			System.out.println(", "+ value.getSal());
		}
		System.out.println("============ value를 이용하여 정보 얻어오기 ============");
		
		Collection<MemberVO> values = hm2.values();
		
		Iterator<MemberVO> memberValue = values.iterator();
		while(memberValue.hasNext()) {
			MemberVO vo = memberValue.next();
			System.out.println(vo.toString());
		}
	}

	public static void main(String[] args) {
		new HashMapTest();
	}

}
