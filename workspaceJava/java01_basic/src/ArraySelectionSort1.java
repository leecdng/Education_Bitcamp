import java.util.Random;
public class ArraySelectionSort1 {

	public static void main(String[] args) {
		Random ran = new Random();
		// 1~100 사이의 난수를 10개 생성하여 배열에 대입 후 오름차순으로 정렬하여 출력
		// Selection Sort
		// 선택 정렬 : 0~n번째 비교해서 최소값을 찾아 0번째와 값을 바꾸고, 그 다음 1~n번째 비교 최소값을 1번째와 바꾸고, 2~n번째 비교 최소값 2번째와 바꾸고..
		
		int ranInt[] = new int[100];
		
		for(int i=0; i<ranInt.length; i++) {
			ranInt[i] = ran.nextInt(100)+1; //0~99 +1
		}
		
		// 선택 정렬
		for(int point=0; point<ranInt.length-1; point++) { // 0,1,2,...,8
			// 비교하여 교환
			for(int i=point+1; i<ranInt.length; i++) { // 0->1,2,3,...,9
													   // 1-> 2,3,4,...,9
				if(ranInt[point] > ranInt[i]) {
					int temp = ranInt[point];
					ranInt[point] = ranInt[i];
					ranInt[i] = temp;
				}
			}
		}
		
		// 출력
		for(int data : ranInt) {
			System.out.print(data+"\t");
		}
		System.out.println();
	}
}
