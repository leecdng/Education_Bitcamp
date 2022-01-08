import java.util.Scanner;
public class Lotto1 {

	public static void main(String[] args) {
		// 로또 번호 생성기
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("게임 수 = ");	// 게임 수 입력
			int cnt = scan.nextInt();
			
			// 입력받은 게임 수만큼 게임 만들기
			for(int game=1; game<=cnt; game++) {	// 입력한 게임 수만큼 반복
				// 게임 1개 만들기
				int[] lotto = new int[7];	// 로또 배열
				for(int i=0; i<lotto.length; i++) { //lotto[0]~lotto[lotto.length-1] 까지 반복
					lotto[i] = (int)(Math.random()*45)+1;	// 1~45까지 숫자 중 난수 구하기

					// 중복검사
					for(int c=0; c<i; c++) {
						if(lotto[i]==lotto[c]) {
							i--;
						}
					}
				}
				
				// 정렬
				for(int i=0; i<lotto.length-2; i++) { //0,1,2,3,4
					for(int j=0; j<lotto.length-2-i; j++) {
						if(lotto[j]>lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
				}
				
				// 출력
				System.out.print(game + "게임=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i] + ", ");
				}
				System.out.println("보너스 " + lotto[6]);
				
			} //for
				
			
			System.out.print("계속하시겠습니까(1.예, 2.아니오)? ");
			int check = scan.nextInt();
			if (check==2) break; // 반복문 중단
			
		} while(true);	//do-while
		
	} //main
} //class
/*
	로또 번호 : 1~45까지 번호 6개
			 보너스 1개
			 
	실행
	게임수 = 3
	1게임 = 5,13,26,32,33,45, 보너스 11
	2게임 = 5,13,26,32,33,45, 보너스 11
	3게임 = 5,13,26,32,33,45, 보너스 11
	계속하시겠습니까(1.예, 2.아니오)? 1
	
	게임수 = 3
	1게임 = 5,13,26,32,33,45, 보너스 11
	2게임 = 5,13,26,32,33,45, 보너스 11
	3게임 = 5,13,26,32,33,45, 보너스 11
	4게임 = 5,13,26,32,33,45, 보너스 11
	5게임 = 5,13,26,32,33,45, 보너스 11
	계속하시겠습니까(1.예, 2.아니오)? 2
	
	주의: 중복되면 안 됨.
	
*/