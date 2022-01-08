import java.util.Scanner;
public class ArrayEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 배열을 이용하는 예제
		// 7과목의 점수를 입력받아 총점과 평균을 구하라.
		// 국어, 영어, 수학, 과학, 물리, 한국사, 도덕
		
		// 과목명으로 나올 데이터를 배열에 보관
		String[] title= {"국어","영어","수학","과학","물리","한국사","도덕"};
		// 각 과목의 점수를 저장할 보관할 배열
		int jumsu[] = new int[7]; //0, 0, 0, 0, 0, 0, 0 --> 0이 7개 들어있음
		
		int sum = 0;
		// 점수 입력
		for(int idx=0; idx<title.length; idx++) {
			System.out.print(title[idx]+"="); // 국어=
			jumsu[idx] = scan.nextInt();
			//총점
			sum = sum + jumsu[idx];
			
		}
		System.out.println("총점="+sum);
		System.out.println("평균="+(double)(sum/title.length));
		

	}

}
