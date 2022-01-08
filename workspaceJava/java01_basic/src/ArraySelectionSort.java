
public class ArraySelectionSort {

	public static void main(String[] args) {
		// 1~100 ������ ������ 10�� �����Ͽ� �迭�� ���� �� ������������ �����Ͽ� ���
		// Selection Sort
		// ���� ���� : 0~n��° ���ؼ� �ּҰ��� ã�� 0��°�� ���� �ٲٰ�, �� ���� 1~n��° �� �ּҰ��� 1��°�� �ٲٰ�, 2~n��° �� �ּҰ� 2��°�� �ٲٰ�..
		
		int[] arr = new int[10];
		
		// 1~100������ ���� 10�� ���ؼ� �迭�� �ֱ�
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("== ���� �� ������ ==");
		for(int i=0; i<arr.length; i++) {	// ���� ���� �迭 10���� ���
			System.out.print(arr[i]+", ");
		}
		
		// ���� �����ϱ�
		for(int j=0; j<arr.length-1; j++) {
			// �ּҰ� ���ϱ�
			int min = arr[j];	// �ּҰ� ��Ƶ� ���� (��ȯX -> ���� �� ���� arr[j]�� �׳� ���� ��ȯ�� �Ǿ����)
			int temp = arr[j];	// ������ arr[j]�� ��Ƶ� ����
			int idx = j;		// �ּҰ��� �ش�Ǵ� �迭�� = arr[idx] // �ּҰ��� �� ��°�� ������ �˾Ƴ��� ����
			for(int i=j; i<arr.length-1; i++) {	// i<arr.length�� �ϰ� min > arr[i] �ؼ� idx = i��� �ص� ��. ���������, �ڱ� �ڽ� ������ ���Ͽ� �� �� �� ���ư�.
				if(min > arr[i+1]) {	// �ӽ��ּҰ��� �� �� �����ͺ��� �ϳ��� ũ�� ��
					min = arr[i+1];		// ���ߴµ� �� �۴ٸ� �ּҰ� ������ �ֱ�
					idx = i+1;			// �ּҰ��� �迭�� arr[idx]�� idx�� ��Ƶα�
				}						// else { min = arr[j] Ȥ�� idx = j } �̹� ������ ���̴� ����
			} //for
			// ��ȯ�ϱ�
			arr[j] = arr[idx];	// ���� �迭�� �� ���� ���ڸ��� �ּҰ��� �迭���� �����
			arr[idx] = temp;	// �ּҰ��� �迭�� �ڸ��� ������ arr[j]���� �־���
		} //for
		// ���
		System.out.println();
		System.out.println("== ���� �� ������ ==");
		for(int result : arr) {
			System.out.print(result+", ");
		}
	}

}