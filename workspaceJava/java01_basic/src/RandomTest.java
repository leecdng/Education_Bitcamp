import java.util.Random;
public class RandomTest {
	
	public static void main(String[] args) {
		// Random : ���� ����Ŭ����
		Random ran = new Random();
		
		for(int i=1; i<=1000; i++) {
			
			//����(int)�� ���Ѵ�.
			// int random = ran.nextInt(); // -21�� ~ 21�� ����
			// int random = ran.nextInt(100); // 0~99������ ����
			// int random = ran.nextInt(50); //0~49
			// boolean random = ran.nextBoolean(); // true, false
			int random = ran.nextInt(51)+50; //// 50~100
 			System.out.print(random+" ");
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}