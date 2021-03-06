import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
public class LottoOOPCollection1 {
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	public LottoOOPCollection1() {}
	
	// 1게임 만들기 + 보너스 포함, 중복검사
	public void lottoCreate(int i) {
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num=0;
		while(lotto.size()<7) {
			// 로또번호 생성
			num = random.nextInt(45)+1;
			lotto.add(num);
		}
		// lotto TreeSet 번호 7개가 있고, num에는 마지막으로 만든 번호가 있다.
		// bonus 번호는 로또 번호에서 지운다. TreeSet 번호 6개가 있다.
		lotto.remove(num);
		
		lottoPrint(i, lotto.toString(), num);
	}
	

	
	
	// 출력 (+정렬)
	public void lottoPrint(int cnt, String lotto, int bonus) {
		System.out.print(cnt+"게임 = ");
		System.out.print(lotto); // 번호
		System.out.println(", 보너스 "+bonus);
	}

	// 계속 여부 확인하는 메서드
	public boolean yesNo() {
		do {
			System.out.print("계속하시겠습니까? (y.예, n.아니오) = ");
			String qa = scan.nextLine();
			// y: 계속(true), n: 종료(false), 그 외: 다시 묻기
			if(qa.equalsIgnoreCase("y")) {
				return true;
			} else if(qa.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.print("계속하시려면 Y를, 종료하시려면 N을 눌러주세요. ");
			}
		}while(true);
	}
	
	public void lottoStart() throws NumberFormatException{
		do {
			System.out.print("게임 수 = ");
			int game = Integer.parseInt(scan.nextLine());
			if(game>=1 && game<=10000) {	// 1~10000까지의 수 넣었을 때만 게임 생성
				// 게임
				for(int i=1; i<=game; i++) {
					lottoCreate(i); // 출력
				} //for
			} else {	// 1~10000까지의 수가 아닌 다른 수를 넣었을 경우 예외 발생
				throw new NumberFormatException();
			} // if
			// 계속 여부
			if(!yesNo()) {
				break;
			}
		}while(true);
	}
	
	
	
	
	// 메인 메서드
	public static void main(String[] args) {
		LottoOOPCollection1 oop = new LottoOOPCollection1();
		boolean repeat = false;
		do {
			try {
				oop.lottoStart();
				repeat = false;
			} catch(NumberFormatException ne) {	// int형 아닌 다른 문자 입력 or 숫자를 너무 길게 or 0또는 음수, 10000초과 숫자 넣었을 경우
				System.out.println("잘못 입력하셨습니다. 1~10000까지의 숫자만 입력 가능합니다.");
				repeat = true;	// 다시 처음부터 반복
			}
		} while(repeat);
	}

}


