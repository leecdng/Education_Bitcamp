
public class StringTest {

	public StringTest() {
		
	}

	public void start() {
		//
		String str1 = "����� ������ �ż���";
		String str2 = "����� ������ �ż���";
		String str3 = new String("����� ������ �ż���");
		String data = str3;
		
		byte[] byteData = {65,66,67,68}; // �ƽ�Ű�ڵ尪 -> ABCD
		String str4 = new String(byteData); //"ABCD"
		
		char[] charData = {'X','Y','Z'}; // "XYZ"
		String str5 = new String(charData);
		
		int[] intData = {65,66,67,68,69,70};
		String str6 = new String(intData, 2, 3); // index 2��°���� 3���� ���ڷ� �����ض�.
		
		System.out.println("byteData="+str4); //byteData=ABCD
		System.out.println("charData="+str5); //charData=XYZ
		System.out.println("intData="+str6); //intData=CDE
		
		if(str1 == str2) { // ����
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		
		if(str1 == str3) { // �ٸ���
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		
		if(str1.equals(str3)) {	// ��ü�� ��ü�� �������� ���Ѵ�.
			System.out.println("����"); //����
		}else{
			System.out.println("�ٸ���");
		}
		
		if(str3==data) { //����.
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		
		str3 = "����� ���α�";
		System.out.println(str3); //����� ���α�
		System.out.println(data); //����� ������ �ż���
		
		char c = str1.charAt(2); // index ��ġ�� ���� 1���� ���´�.
		System.out.println("str1.charAt(2)->"+c); //str1.charAt(2)->��
		
		String result = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result="+result); // result=����� ������ �ż�������� ������ �ż���
		System.out.println("result2="+result2); // result2=����� ������ �ż�������� ������ �ż���
		
		String data2="Java String Test";
		String data3="java string test";
		if(data2.equals(data3)) { // �ٸ���
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(data2.equalsIgnoreCase(data3)) {	// ��ҹ��� �������� ������ ��
			System.out.println("����"); // ����
		}else {
			System.out.println("�ٸ���");
		}
		
		byte[] byteCode = data2.getBytes(); // ���ڿ��� byte �迭�� ���Ѵ�
		for( byte b : byteCode ) {
			System.out.print((char)b+"->"+b+",");
		}
		System.out.println();
		
		int idx = data2.indexOf("t");// Ư�������� index ��ġ�� ���Ѵ�
		System.out.println("indexOf -> "+idx); //indexOf -> 6
		
		int idx2 = data2.indexOf("t", 10); // t�� �˻��ϴµ� 10��°���� �˻���
		System.out.println("indexOf -> "+idx2); //indexOf -> 15
		
		int idx3 = data2.lastIndexOf("t");// Ư�����ڸ� �ڿ��� �˻��Ͽ� index�� ���Ѵ�.
		System.out.println("lastIndexOf -> "+ idx3); //lastIndexOf -> 15
		
		System.out.println("length="+data2.length()); // length=16
		
		// String data2 = "Java String Test";
		// Ư�����ڸ� �ٸ� ���ڷ� �����Ѵ�.
		data2 = data2.replaceAll("a", "����");
		System.out.println("replaceAll -> "+data2); // replaceAll -> J����v���� String Test
		
		String data4 = "010-1234-5678";
		String[] tel = data4.split("-"); // Ư�����ڷ� ���ڿ��� ��������. �迭�� �����Ѵ�.
		for(int i=0; i<tel.length; i++) {
			System.out.println("tel["+i+"]="+tel[i]);
		}
		
		// substring : Ư�����ڿ����� �Ϻ� ���ڿ��� ���´�.
		String tel1 = data4.substring(4); // 1234-5678
		String tel2 = data4.substring(4, 8); // 1234
		System.out.println(tel1+", "+tel2);
		
		// toCharArray() : ���ڿ��� char �迭�� �ɰ��� �����ش�.
		char[] charData2 = data2.toCharArray();
		for(char cc : charData2 ) {
			System.out.print(cc+", ");
		}
		// toLowerCase : �ҹ��ڷ�, toUpperCase : �빮�ڷ�
		String toLower = data2.toLowerCase();
		String toUpper = data2.toUpperCase();
		System.out.println(toLower+", "+toUpper);
		
		// trim() : ���ڿ��� ���ʿ� ���鹮�� �����.
		String data6 = "  Spring  FrameWork      ";
		String dataTrim = data6.trim();
		System.out.println("AA"+dataTrim+"BB");
		
		int num = 1234;
		String s1 = num+"";// ����ȭ
		String s2 = String.valueOf(num); // boolean���̶�� "true" �̷� ������ ��
		System.out.println(s1+1234); // StringŸ���̶� ���� �������� �ȵ�
		System.out.println(s2+1234); // StringŸ��
		
		char[] aa = {'S','T','U'};
		String sss = new String(aa);	// �����ڸ� �̿��Ͽ� ����ȭ
		String sss2 = String.valueOf(aa);	// �޼ҵ带 �̿��Ͽ� ����ȭ
		
		System.out.println(sss);
		System.out.println(sss2);
		
		String data7 = "Appledsadasd";
		String data8 = "apple";
		int r1 = data7.compareTo(data8); // -32
		int r2 = data8.compareTo(data7); // 32 // 
		int r3 = data8.compareToIgnoreCase(data7); // 0 // compareToIgnoreCase�� ��ҹ��� �������� ���ؼ� 0�� ����.
		System.out.println(r1+", "+r2+", "+r3);
	}
	
	
	public static void main(String[] args) {
		new StringTest().start();	/////

	}

}