import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class LottoOOPException {	// 선생님 답
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public LottoOOPException() {}
	
	// 1게임 만들기 + 보너스 포함
	public int[] lottoCreate() {
		int lotto[] = new int[7];
		for(int i=0; i<lotto.length; i++) {	// 0~6까지
			// 로또 번호 생성
			lotto[i] = random.nextInt(45)+1;
			// 중복검사 메서드 호출
			i = doubleCheck(lotto, i);
		}
		return lotto;
	}
	
	// 중복검사
	public int doubleCheck(int lotto[], int i) { // 위의 메소드가 실행되면 그 안에 있는 변수랑 매개변수랑 같다고 보면 된다..?
		for(int j=0; j<i; j++) { // 현재 배열값 앞의 배열값하고만 비교
			if(lotto[j] == lotto[i]) {
				i--;
				break; // 앞에 이미 중복값 있으면 반복문 멈추기
			}
		}
		return i;
	}
	
	// 출력 (+정렬)
	public void lottoPrint(int cnt, int lotto[]) {
		System.out.print(cnt+"게임 = ");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6))); // 번호
		System.out.println(", 보너스 "+lotto[6]);
	}

	// 계속 여부 확인하는 메서드
	public boolean yesNo() {
		do {
			System.out.print("계속하시겠습니까? (y.예, n.아니오) = ");
			String qa = scan.nextLine();
			// y: 계속(true), n: 종료(false), 그 외: 다시 묻기
			if(qa.equalsIgnoreCase("y")) {
				return true; // break 안 넣어도 반환되면 반복문 끝나네??????
			} else if(qa.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.print("계속하시려면 Y를, 종료하시려면 N을 눌러주세요. ");
			}
		}while(true);
	}
	
	public void lottoStart() {
		do {
			try {
				System.out.print("게임 수 = ");
				int game = Integer.parseInt(scan.nextLine());
				if(game<1 || game>10000) {	// 1미만의 정수를 넣었을 경우
					System.out.println("1~10000까지의 숫자만 입력 가능합니다.");
				} else {
					// 게임
					for(int i=1; i<=game; i++) {
						int lotto[] = lottoCreate();
						Arrays.sort(lotto, 0, 6); // 정렬
						lottoPrint(i, lotto); // 출력
					} //for
				} // if
				// 계속 여부
				if(!yesNo()) {
					break;
				}
			} catch(NumberFormatException ne) {	// int형이 아닌 다른 문자를 입력했을 경우
				System.out.println("잘못 입력하셨습니다. 1~10000까지의 숫자만 입력 가능합니다.");
			}
		}while(true);
	}
	
	
	
	
	// 메인 메서드
	public static void main(String[] args) {
		LottoOOPException oop = new LottoOOPException();
		oop.lottoStart();
	}

}


