
public class ArrayEx04 {

	public static void main(String[] args) {
		
		int arr[][] = new int[10][10]; // 0~9����
		
		for(int r=0; r<arr.length-1; r++) {	// ���ȣ //0~8������ �ݺ�
			for(int c=0; c<arr[r].length-1; c++) { // ����ȣ 0~8
					arr[r][c] = (r+1) * (c+1);
					arr[r][9] = arr[r][9] + arr[r][c]; // ���� �� // arr[r][9]�� �ʱⰪ�� 0
					//arr[r][9] += arr[r][c];
					arr[9][c] = arr[9][c] + arr[r][c]; // ���� �� // arr[9][c]�� �ʱⰪ�� 0
			}
		}
		
		// arr[9][9] = 0;
				
		for(int[] data : arr) {
			for(int a : data) {
				System.out.print(a+"\t");
			}
			System.out.println();
		}
	}
}