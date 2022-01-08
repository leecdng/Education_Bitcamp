import java.util.Scanner;
import java.util.Calendar;

class CalendarEx
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		System.out.print("연도 = ");		//입력값 받아오기
		int dataYear = scan.nextInt();
		System.out.print("월 = ");
		int dataMonth = scan.nextInt();

		System.out.printf("\t \t %d년 %d월\n\n", dataYear, dataMonth);	// xxxx년 xx월
		System.out.println("일\t월\t화\t수\t목\t금\t토");	// 요일 출력

		int dataDay = 1;
		cal.set(dataYear, dataMonth-1, dataDay);	// xxxx년 xx월 1일로 세팅

		//int year = cal.get(Calendar.YEAR);		// 값 불러오기 // 연도, 월, 일, 요일
		//int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//출력
		for(int i=1; i<=6; i++){	// 6주
			int j=1;
			if(i==1){	// 1주 때
				for(int s=1; s<=week-1; s++){	// 1일의 요일 앞부분은 공백
					System.out.print("\t");
				}
				for(j=1; j<=7-(week-1); j++){	// 공백을 제외한 나머지 날만큼은 1일부터 출력
					if(dataDay<=31){
						System.out.print(dataDay+"\t");
						dataDay++;
					}
				}
			}else{	//2~6주 때
				for(j=1; j<=7; j++){	// 요일 7개
					cal.set(dataYear, dataMonth-1, dataDay);	// 하나씩 늘어난 dataDay를 새로 세팅
					day = cal.get(Calendar.DAY_OF_MONTH);	// 해당 데이터 불러오기

					if(dataDay<=31 && dataDay==day){	// 31일까지 중 실제 데이터에 있는 날만 출력
						System.out.print(dataDay+"\t");
					}
					else break;	// 31일 넘거나 실제 데이터에 없는 날짜면 멈춤
					
					dataDay++;

				} //for
			} //if-else
			System.out.println();	// 줄바꿈
		} //for
		//System.out.println(cal);
	} //main
} //class