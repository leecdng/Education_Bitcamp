import java.util.Scanner;
public class ArrayEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			// 값 입력받기
			System.out.print("금액을 입력하세요? ");
			int money = scan.nextInt();
			
			int won[][] = new int[10][2];
			// 화폐 단위 배열 만들기
			int d = 5;
			for(int r=0; r<won.length; r++) {
				//for(int c=0; c<won[r].length; c++) {
					won[r][0] = 50000;
					if(r>0) {
						won[r][0] = won[r-1][0]/d;
						if(d == 5) {
							d = 2;
						}else {
							d = 5;
						}
					}
				//}
			}


			for(int r=0; r<won.length; r++) {
				won[r][1] = money/won[r][0];
				money = money%won[r][0];
				//won[r][1] = money/won[r][0];	// 왜 순서 바뀌면 0나오는지..???
												// ---> 이미 작아진 금액을 큰 단위 현재 화폐로 나눈 값을 구하려고 해서 0 나왔던 것
				if(won[r][1]>0) {
					if(won[r][0]>=1000) {
						System.out.println(won[r][0]+"원= "+won[r][1]+"장");
					}
					else{
						System.out.println(won[r][0]+"원= "+won[r][1]+"개");
					}
				}
			}
			
			// 끝낼지 선택
			System.out.print("다시 하시겠습니까? (1.예, 2.아니오) ");
			int data = scan.nextInt();
			if(data==2) break;
			
		} while(true);

	}

}

/*
배열을 이용하여 만들기....^^

50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
 
실행
금액을 입력하세요? 126300
50000원=2장
10000원=2장
5000원=1장
1000원=1장
100원=3개
다시 하시겠습니까? (1.예, 2.아니오) : 1

금액을 입력하세요? 5435
5000원=1장
100원=4개
10원=3개
1원=5개
다시 하시겠습니까? (1.예, 2.아니오) : 2
*/