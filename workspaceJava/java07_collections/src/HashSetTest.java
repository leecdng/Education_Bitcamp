import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		// Set �������̽� ��� ���� Ŭ����
		// 1. �Է� ������ �������� �ʴ´�.
		// 2. �ߺ������͸� ������� �ʴ´�.
		
		double[] data = {12.3, 3.4, 5.6, 12.3, 5.2, 9.1, 9.1, 6.7};
		// 				{12.3, 3.4, 5.6, 5.2, 9.1, 6.7};
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for(double d : data) {
			hs.add(d);
		}
		
		System.out.println("size= "+ hs.size());
		
		Iterator<Double> ii = hs.iterator();
		
		while(ii.hasNext()) { // ��ü�� ������ true, ������ false
			Double iiData = ii.next();
			System.out.println(iiData); // �����ʹ� �� ������ ���� ���� ��µ�. set�� Ư¡.
		}
		
		
	}

	public static void main(String[] args) {
		new HashSetTest();

	}

}