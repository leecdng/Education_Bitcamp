import java.util.Scanner;
import java.util.Arrays;
public class LottoOOP {
	Scanner scan = new Scanner(System.in);
	
	int cnt;	// 게임 수
	int[] lotto = new int[7];	// 로또 번호 배열
	
	public LottoOOP() {}
	
	// 게임수 입력받기
	public int inputCount() {		
		System.out.print("게임 수 = ");
		return scan.nextInt();
	}
	
	// 로또 번호 랜덤 생성
	public int[] lottoNum() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*10)+1;	//1~45 랜덤 숫자를 lotto 배열값으로 설정
			i = doubleCheck(i);
		}
		return lotto;	// 랜덤 숫자를 가진 lotto 배열 반환
	}
	
	// 중복 검사
	public int doubleCheck(int i) {
		for(int j=0; j<i; j++) {
			if(lotto[j]==lotto[i]) {
				i--;
				break; // 앞에 이미 중복값 있으면 반복문 멈추기
			}
		}
		
		return i;
	}
	
	
	// 로또 번호 정렬 // Arrays 쓰기
	public void lottoArr(int[] lotto) {
		this.lotto = lotto;
		
		Arrays.sort(lotto, 0, 6);	// lotto 배열이 보너스를 제외한 숫자가 정렬됨
	}
	
	// 로또 번호만 출력 (생성, 정렬하고 출력)
	public void lottoPrint(int[] lotto) {
		this.lotto = lotto;
		lottoArr(lottoNum()); // 로또 번호 생성, 정렬
		for(int j=0; j<lotto.length; j++) {
			if(j==6) System.out.print("보너스 " + lotto[j]); 	// 보너스 번호 출력
			else System.out.print(lotto[j] + ", ");	// 나머지 번호 출력
		}
	}
	
	// 게임 수만큼 반복 + 몇 게임인지 명시
	public void lottoRepeat(int cnt) {
		this.cnt = cnt;
		cnt = inputCount();	// cnt = 입력 받은 값 (게임 수)
		
		for(int i=1; i<=cnt; i++) {	// 게임 수만큼 반복
			// 로또 번호 출력
			System.out.print(i + "게임 = ");
			lottoPrint(lotto); // 로또 번호 출력 메서드 (생성, 정렬, 출력)
			System.out.println(); // 줄 바꿈
		}
	}
	
	// 계속하겠습니까? (1.예, 2.아니오) 선택
	public int inputSelect() {
		System.out.print("계속하시겠습니까? (1.예, 2. 아니오) = ");
		return scan.nextInt();	// 선택한 숫자를 반환
	}
	
	// 최종 실행 // 1이면 계속 반복, 2면 종료
	public void start() {
		do {
		
			lottoRepeat(cnt);	// 로또 번호 출력 (입력된 값만큼, 생성+정렬된 로또 배열을)
			if(inputSelect() == 2) break;	// 2가 반환됐으면 종료
			
		} while(true);
	}
	
	
	
	// 메인 메서드
	public static void main(String[] args) {
		LottoOOP oop = new LottoOOP();
		oop.start();

	}

}



// 게임 수만큼 반복해서 출력
/*
public void lottoPrint(int cnt, int[] lotto) {
	this.cnt = cnt;
	this.lotto = lotto;
	cnt = inputCount();	// cnt = 입력 받은 값 (게임 수)
	
	for(int i=1; i<=cnt; i++) {	// 게임 수만큼 반복
		// 로또 번호 생성, 생성한 번호 정렬하기
		lottoArr(lottoNum());
		// 로또 번호 출력
		System.out.print(i + "게임 = ");
		for(int j=0; j<lotto.length; j++) {
			if(j==6) System.out.print("보너스 " + lotto[j]); 	// 보너스 번호 출력
			else System.out.print(lotto[j] + ", ");	// 나머지 번호 출력
		}
		System.out.println(); // 줄 바꿈
	} //for
}
*/
