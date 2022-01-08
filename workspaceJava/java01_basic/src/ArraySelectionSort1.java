import java.util.Random;
public class ArraySelectionSort1 {

	public static void main(String[] args) {
		Random ran = new Random();
		// 1~100 ������ ������ 10�� �����Ͽ� �迭�� ���� �� ������������ �����Ͽ� ���
		// Selection Sort
		// ���� ���� : 0~n��° ���ؼ� �ּҰ��� ã�� 0��°�� ���� �ٲٰ�, �� ���� 1~n��° �� �ּҰ��� 1��°�� �ٲٰ�, 2~n��° �� �ּҰ� 2��°�� �ٲٰ�..
		
		int ranInt[] = new int[100];
		
		for(int i=0; i<ranInt.length; i++) {
			ranInt[i] = ran.nextInt(100)+1; //0~99 +1
		}
		
		// ���� ����
		for(int point=0; point<ranInt.length-1; point++) { // 0,1,2,...,8
			// ���Ͽ� ��ȯ
			for(int i=point+1; i<ranInt.length; i++) { // 0->1,2,3,...,9
													   // 1-> 2,3,4,...,9
				if(ranInt[point] > ranInt[i]) {
					int temp = ranInt[point];
					ranInt[point] = ranInt[i];
					ranInt[i] = temp;
				}
			}
		}
		
		// ���
		for(int data : ranInt) {
			System.out.print(data+"\t");
		}
		System.out.println();
	}
}