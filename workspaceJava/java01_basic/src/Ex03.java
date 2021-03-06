import java.util.Scanner;

class Ex03
{
	public static void main(String[] args) 
	{
		// 내가 쓴 답
		Scanner scan = new Scanner(System.in);

		for(;;){

			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 사각형의 넓이 / 2. 사각형의 둘레 / 3. 종료");
			int n = scan.nextInt();

			if(n==3){
				//프로그램 종료
				System.exit(0);
			}

			System.out.print("가로(밑변) : ");
			int width = scan.nextInt();

			System.out.print("세로(높이) : ");
			int height = scan.nextInt();

			int n1 = width * height;
			int n2 = (width + height) * 2; // 2번 둘레
			int result = (n == 1)? n1 : n2;// 1번 넓이

			// 쌤 답 추가
			String msg = (n == 1)? "넓이":"둘레";


			System.out.println("사각형의 " + msg + "는 " + result);
		}
		
		

	}
}



/*
	실행
	메뉴 선택 (1. 사각형의 넓이, 2. 사각형의 둘레)? 1
	가로(밑변)=
	세로(높이)=
	사각형의 넓이 (밑변 * 높이)=

	메뉴 선택 (1. 사각형의 넓이, 2. 사각형의 둘레)? 2
	가로(밑변)=
	세로(높이)=
	사각형의 둘레((가로+세로)*2) =
*/