import java.util.Scanner;

class Study001
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);


		// 사각형 4*6
		for(int i=1; i<=6; i++){
			for(int j=1; j<=4; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		// 왼쪽 정렬 직각삼각형 5*5
		for(int i=1; i<=5; i++){ 
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		// 왼쪽 정렬 역 직각삼각형 5*5
		for(int i=5; i>=1; i--){ 
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// 오른쪽 정렬 직각삼각형 5*5
		for(int i=1; i<=5; i++){
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		// 오른쪽 정렬 역 직각삼각형 5*5
		for(int i=5; i>=1; i--){
			for(int s=1; s<=5-i; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();


		// 이등변삼각형 //1,3,5,7,9...25

		for(int i=1; i<=25; i+=2){ 
			for(int s=1; s<=(25-i)/2; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();


		// 이등변삼각형에 알파벳 이어넣기

		char c ='A';
		for(int i=1; i<=25; i+=2){
			for(int s=1; s<=(25-i)/2; s++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(c++);
				if(c=='Z'){
					c='A';	
				}
			}
			System.out.println();
		}
		
		System.out.println();


		// 임의의 홀수 입력해서 다이아몬드 모양 만들기 + 알파벳 이어넣기
		
		System.out.print("임의의 홀수 입력(1~49) = ");
		int odd = scan.nextInt();
		
		int n = 2;	//증감값을 변수로 준다
		char ch = 'A';

		
		for(int i=1; i>0; i+=n){	// i>0 --> i가 1 남을 때까지 계속 돌리라는 것
			for(int s=1; s<=(odd-i)/2; s++){	//공백
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){	//값
				System.out.print(ch++);	//이어서 출력되게
				if(ch>'Z'){		// A~Z까지만 출력되게
					ch='A';
				}
			} //for
			System.out.println();	//줄바꿈

			if(i>=odd){	// i==odd도 될 것 같다
				n= -2;	// 증가값을 감소값으로 바꾸기
			}
		} //for




		// 아래 역삼각형 붙이기
		/*
		for(int i=odd-2; i>=1; i-=n){
			for(int s=1; s<=(odd-i)/2; s++){
				System.out.print(" ");			
			}
			for(int j=1; j<=i; j++){
				if(ch>'Z'){
					ch='A';
				}
				System.out.print(ch++);
			}
			System.out.println();
		}

		*/

	}
}
