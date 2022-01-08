
public class StringTest {

	public StringTest() {
		
	}

	public void start() {
		//
		String str1 = "서울시 마포구 신수동";
		String str2 = "서울시 마포구 신수동";
		String str3 = new String("서울시 마포구 신수동");
		String data = str3;
		
		byte[] byteData = {65,66,67,68}; // 아스키코드값 -> ABCD
		String str4 = new String(byteData); //"ABCD"
		
		char[] charData = {'X','Y','Z'}; // "XYZ"
		String str5 = new String(charData);
		
		int[] intData = {65,66,67,68,69,70};
		String str6 = new String(intData, 2, 3); // index 2번째부터 3개를 문자로 생성해라.
		
		System.out.println("byteData="+str4); //byteData=ABCD
		System.out.println("charData="+str5); //charData=XYZ
		System.out.println("intData="+str6); //intData=CDE
		
		if(str1 == str2) { // 같다
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		if(str1 == str3) { // 다르다
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		if(str1.equals(str3)) {	// 객체와 객체가 같은지를 구한다.
			System.out.println("같다"); //같다
		}else{
			System.out.println("다르다");
		}
		
		if(str3==data) { //같다.
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		str3 = "서울시 종로구";
		System.out.println(str3); //서울시 종로구
		System.out.println(data); //서울시 마포구 신수동
		
		char c = str1.charAt(2); // index 위치의 문자 1개를 얻어온다.
		System.out.println("str1.charAt(2)->"+c); //str1.charAt(2)->시
		
		String result = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result="+result); // result=서울시 마포구 신수동서울시 마포구 신수동
		System.out.println("result2="+result2); // result2=서울시 마포구 신수동서울시 마포구 신수동
		
		String data2="Java String Test";
		String data3="java string test";
		if(data2.equals(data3)) { // 다르다
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(data2.equalsIgnoreCase(data3)) {	// 대소문자 구별없이 같은지 비교
			System.out.println("같다"); // 같다
		}else {
			System.out.println("다르다");
		}
		
		byte[] byteCode = data2.getBytes(); // 문자열을 byte 배열로 구한다
		for( byte b : byteCode ) {
			System.out.print((char)b+"->"+b+",");
		}
		System.out.println();
		
		int idx = data2.indexOf("t");// 특정문자의 index 위치를 구한다
		System.out.println("indexOf -> "+idx); //indexOf -> 6
		
		int idx2 = data2.indexOf("t", 10); // t를 검색하는데 10번째부터 검색해
		System.out.println("indexOf -> "+idx2); //indexOf -> 15
		
		int idx3 = data2.lastIndexOf("t");// 특정문자를 뒤에서 검색하여 index를 구한다.
		System.out.println("lastIndexOf -> "+ idx3); //lastIndexOf -> 15
		
		System.out.println("length="+data2.length()); // length=16
		
		// String data2 = "Java String Test";
		// 특정문자를 다른 문자로 변경한다.
		data2 = data2.replaceAll("a", "에이");
		System.out.println("replaceAll -> "+data2); // replaceAll -> J에이v에이 String Test
		
		String data4 = "010-1234-5678";
		String[] tel = data4.split("-"); // 특정문자로 문자열을 조각낸다. 배열로 리턴한다.
		for(int i=0; i<tel.length; i++) {
			System.out.println("tel["+i+"]="+tel[i]);
		}
		
		// substring : 특정문자열에서 일부 문자열을 얻어온다.
		String tel1 = data4.substring(4); // 1234-5678
		String tel2 = data4.substring(4, 8); // 1234
		System.out.println(tel1+", "+tel2);
		
		// toCharArray() : 문자열을 char 배열로 쪼개서 구해준다.
		char[] charData2 = data2.toCharArray();
		for(char cc : charData2 ) {
			System.out.print(cc+", ");
		}
		// toLowerCase : 소문자로, toUpperCase : 대문자로
		String toLower = data2.toLowerCase();
		String toUpper = data2.toUpperCase();
		System.out.println(toLower+", "+toUpper);
		
		// trim() : 문자열의 양쪽에 공백문자 지운다.
		String data6 = "  Spring  FrameWork      ";
		String dataTrim = data6.trim();
		System.out.println("AA"+dataTrim+"BB");
		
		int num = 1234;
		String s1 = num+"";// 문자화
		String s2 = String.valueOf(num); // boolean형이라면 "true" 이런 식으로 됨
		System.out.println(s1+1234); // String타입이라 숫자 연산으로 안됨
		System.out.println(s2+1234); // String타입
		
		char[] aa = {'S','T','U'};
		String sss = new String(aa);	// 생성자를 이용하여 문자화
		String sss2 = String.valueOf(aa);	// 메소드를 이용하여 문자화
		
		System.out.println(sss);
		System.out.println(sss2);
		
		String data7 = "Appledsadasd";
		String data8 = "apple";
		int r1 = data7.compareTo(data8); // -32
		int r2 = data8.compareTo(data7); // 32 // 
		int r3 = data8.compareToIgnoreCase(data7); // 0 // compareToIgnoreCase는 대소문자 구문없이 비교해서 0이 나옴.
		System.out.println(r1+", "+r2+", "+r3);
	}
	
	
	public static void main(String[] args) {
		new StringTest().start();	/////

	}

}
