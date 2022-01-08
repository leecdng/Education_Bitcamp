import java.util.Scanner;
public class ArrayScoreException1 {
	// 선생님 답
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			try {
				System.out.print("학생 수 = ");
				int cnt = Integer.parseInt(scan.nextLine());
				
				// 데이터 저장할 공간 확보
				String name[] = new String[cnt]; //학생 이름을 저장할 배열
				int jumsu[][] = new int[cnt+2][6]; // 학생 점수를 저장할 배열 //+2는 과목별 점수 평균 내려고
				
				//이름과 점수를 입력 받아 배열에 저장
				String title[]={"국어", "영어", "수학"};
				for(int i=0; i<cnt; i++) { //0,1,2,...	-> 행 번호
					System.out.print("이름 = ");
					name[i] = scan.nextLine();
					for(int j=0; j<title.length; j++) { // 0,1,2 -> 열 번호
						try {
							System.out.print(title[j]+" = ");
							jumsu[i][j] = Integer.parseInt(scan.nextLine());
							// 점수의 범위가 0~100사이가 아니면 예외 발생 MyException 예외를 발생시킴
							if(jumsu[i][j]<0 || jumsu[i][j]>100) { // 점수가 0~100사이가 아닐 때
							//if(!(jumsu[i][j]>=0 && jumsu[i][j]<=100)) { // 점수가 0~100사이가 아닐 때
								//강제 예외 발생
								throw new MyException(title[j]+"점수는 0~100사이의 값이어야 합니다.");
							}
						} catch(MyException me) {
							System.out.println(me.getMessage());
							// 다시 해당과목의 점수를 입력받기 위해서 j의 감소
							j--;
						} catch(NumberFormatException nfe) {
							System.out.println("학생 수 또는 점수는 0 이상의 정수여야 합니다.");
							j--;
						}
					}
				}
				
				// 개인별 총점, 평균
				// 과목별 총점
				for(int i=0; i<cnt; i++) {
					for(int j=0; j<3; j++) {
						jumsu[i][3] += jumsu[i][j]; //개인별 총점
						jumsu[cnt][j] += jumsu[i][j]; // 과목별 총점
					}
					// 개인별 평균
					jumsu[i][4] = jumsu[i][3]/3;
				}
				//과목별 평균
				for(int i=0; i<3; i++) {
					jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
				}
				
				
				// 석차 구하기
				for(int i=0; i<cnt; i++) {	// 0,1,2,...,9
					// i가 본인 점수 위치
					//jumsu[i][5] = 1;
					for(int j=0; j<cnt; j++) {
						if(jumsu[i][3] < jumsu[j][3]) {
							jumsu[i][5]++;	// 나보다 점수가 큰 학생의 수만큼 표시 = 등수
						}
					}
					jumsu[i][5]++;
				}
				
				//석차 순으로 구하기
				for(int i=0; i<cnt-1; i++) {
					for(int j=0; j<cnt-1; j++) {
						if(jumsu[j][5] > jumsu[j+1][5]) {
							// 교환
							// 이름 바꾸기
							String nameTemp = name[j];
							name[j] = name[j+1];
							name[j+1] = nameTemp;
							for(int k=0; k<jumsu[j].length; k++) { //0,1,2,3,4,5
								int temp = jumsu[j][k];
								jumsu[j][k] = jumsu[j+1][k];
								jumsu[j+1][k] = temp;
							}
						}
					}
				}
				
				
		
				// =======출력==========
				System.out.println("====================================================");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("====================================================");
				
				for(int i=0; i<cnt; i++) {
					// 이름 출력
					System.out.print(name[i]+"\t");
					// 점수 출력 국어, 영어, 수학, 총점, 평균
					for(int j=0; j<jumsu[i].length; j++) {
						System.out.print(jumsu[i][j]+"\t");
					}
					System.out.println();
				}
				
				// 과목별 총점
				System.out.print("총점\t");
				for(int i=0; i<3; i++) {	// 0,1,2
					System.out.print(jumsu[cnt][i]+"\t");
				}
				System.out.println();
				// 과목별 평균
				System.out.print("평균\t");
				for(int i=0; i<3; i++) {
					System.out.print(jumsu[cnt+1][i]+"\t");
				}
				System.out.println();
			} catch(NumberFormatException nfe) {
				System.out.println("학생 수 또는 점수는 0 이상의 정수여야 합니다.");
			}
		} while(true);

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