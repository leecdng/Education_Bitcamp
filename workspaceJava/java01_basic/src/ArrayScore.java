import java.util.Scanner;
public class ArrayScore {
	// 내가 해보다 멈춘 것..^^

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 = ");
		int student = scan.nextInt();
		
		int cnt = 0;
		int school[][]=new int[student][7];
		
		do {
			System.out.print("이름 = ");
			int name = scan.nextInt();
			System.out.print("국어 = ");
			int kor = scan.nextInt();
			System.out.print("영어 = ");
			int eng = scan.nextInt();
			System.out.print("수학 = ");
			int math = scan.nextInt();
			
			int total = kor + eng + math;
			int ave = total/3;
			int ranking=1;
			
			
			school[cnt][0] = name;
			school[cnt][1] = kor;
			school[cnt][2] = eng;
			school[cnt][3] = math;
			school[cnt][4] = total; // 총점
			school[cnt][5] = ave;
			school[cnt][6] = ranking;
			
			if(cnt >= student-1) break;
			cnt++;
			
		} while(true);
		
		
		// 데이터 석차순 정렬
		for(int j=0; j<school.length; j++) {
			
			for(int i=0; i<student-1; i++) {
				int top[] = new int[7];
				top[j] = school[i][j];
					
				if(school[i][4]<school[i+1][4]) {
					school[i][j] = school[i+1][j];
					school[i+1][j] = top[j];
				}
			}
		}
		
		
		//출력
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("====================================================");
		
		
		// 배열 출력
		for(int sch[] : school ) {
			for( int result : sch) {
				System.out.print(result+"\t");
			}
			System.out.println();
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
	====================
	이름	국어	영어	수학	총점	평균	석차
	====================
	홍길동 90	89	90	269	___	1
	이길동 90	90	43	223	___ 2
	  :	  :	:	:	:	:	:
	과목별총점__ __ __
	과목펼평균__ __ __

*/