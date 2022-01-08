import java.util.Scanner;
public class ArrayScore2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 = ");
		int cnt = Integer.parseInt(scan.nextLine());
		
		// 배열 만들기
		String nameList[] = new String[cnt];
		int jumsu[][] = new int[cnt][6];		// +2는 과목별 총점, 평균 자리
		
		int n = 0;
		// 값 반복해서 입력받기 + 값을 배열에 저장하기
		do {			
			// 값 입력 받고 바로 배열값 넣어주기
			System.out.print("이름 = ");
			String name = scan.nextLine(); 
			nameList[n] = name;
			
			System.out.print("국어 = ");
			int kor = Integer.parseInt(scan.nextLine());
			System.out.print("영어 = ");
			int eng = Integer.parseInt(scan.nextLine());
			System.out.print("수학 = ");
			int math = Integer.parseInt(scan.nextLine());
			
			jumsu[n][0] = kor;	// 국어 점수
			jumsu[n][1] = eng;	// 영어 점수
			jumsu[n][2] = math;	// 수학 점수
			
			/*
			String title[] = {"국어","영어","수학"};
			for(int i=0; i<3; i++) {
				System.out.print(title[i] + "= ");
				jumsu[cnt-1][i] = Integer.parseInt(scan.nextLine());
			}
			*/
			for(int i=0; i<3; i++) {
				jumsu[n][3] += jumsu[n][i]; // 개인별 총점
			}
			jumsu[n][4] = jumsu[n][3] / 3; // 개인별 평균
			
			n++;
		} while(n<cnt);
		
		// 석차 구하기
		for(int i=0; i<cnt; i++) {
			jumsu[i][5] = 1;
			for(int j=0; j<cnt; j++) {
				if(jumsu[i][3]<jumsu[j][3]) {
					jumsu[i][5]++;
				}
			}
		}
		
		// 석차 순으로 정렬하기 // 버블 선택 둘 다 해보기
		for(int i=0; i<cnt-1; i++) {
			// 정렬하기
			for(int j=0; j<cnt-1; j++) {
				if(jumsu[j][5]>jumsu[j+1][5]) {
					String nameTemp = nameList[j];
					nameList[j] = nameList[j+1];
					nameList[j+1] = nameTemp;
					for(int k=0; k<jumsu[i].length; k++) {
						int temp= jumsu[j][k];
						jumsu[j][k] = jumsu[j+1][k];
						jumsu[j+1][k] = temp;
					}
				}
			}
		}
		
		
		// 출력하기
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("====================================================");
		
		for(int i=0; i<cnt; i++) {	
			System.out.print(nameList[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		int sum[]=new int[3];
		int ave[]=new int[3];
		System.out.print("과목별총점\t");
		for(int j=0; j<3; j++) {
			for(int i=0; i<cnt; i++) {
				sum[j] += jumsu[i][j];
			}
			System.out.print(sum[j]+"\t");
		}
		System.out.println();
		
		System.out.print("과목별평균\t");
		for(int i=0; i<3; i++) {
			ave[i]=sum[i]/cnt;
			System.out.print(ave[i]+"\t");
		}
		

	}

}

/*
	학생 수를 입력 받아 이름과, 세 과목의 점수를 입력 받은 후
	각 학생의 총점, 평균, 석차, 과목별 총점, 평균을 구하여 석차순으로 출력하라.
	
	실행
	학생수=3
	이름=홍길동
	국어=90
	영어=89
	수학=90
	이름=이길동
	국어=90
	영어=90
	수학=43
	:
	:
	===========================
	이름	국어	영어	수학	총점	평균	석차
	===========================
	홍길동 90	89	90	269	___	1
	이길동 90	90	43	223	___ 2
	  :	  :	:	:	:	:	:
	과목별총점__ __ __
	과목펼평균__ __ __

*/