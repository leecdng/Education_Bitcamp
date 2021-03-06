
        import java.util.Arrays;
        import java.util.InputMismatchException;
        import java.util.Scanner;

public class 김기솔LottoException {
    Scanner scan = new Scanner(System.in);
    int opt = 1, cnt;
    int[] array = new int[7];
    //생성자 메소드
    public 김기솔LottoException(){
        do{
            int[] array = new int[7];
            inputCnt();
            for (int i = 0; i < cnt; i++) {
                System.out.print(i + "게임 : ");
                array = sortArray(makeArray());
                printArray(array);
                System.out.print("bonus : " + array[6] + "\n");
            }
            chooseOpt();
        }while(opt == 1);
    }
    //횟수 정하기
    public void inputCnt() {
        while (true) {
            try{
                System.out.print("몇 회 하시겠습니까?=");
                cnt = scan.nextInt();
                if (cnt <= 0) throw new LottoException();
                else break;
            }catch(LottoException le){
                System.out.println(le.getMessage());
            }catch(InputMismatchException ime){
                scan = new Scanner(System.in);
                System.out.println("양의 정수가 아닌 값이 입력되었습니다.");
            }
        }
    }
    //로또 번호 생성
    public int[] makeArray(){
        int[] array = new int[7];
        for(int i = 0; i < 7; i++){
            array[i] = (int)(Math.random()*45) + 1;
            for(int j = 0; j < i; j++) {
                if(array[i] == array[j]) i--;
            }
        }
        return array;
    }
    //1~6번 번호 오름차순 정렬
    public int[] sortArray(int[] array){
        Arrays.sort(array, 0, 6);
        return array;
    }
    //1~6번 출력하기
    public void printArray(int[] array){
        for(int i = 0; i < 6; i++){
            System.out.print(array[i] + ", ");
        }
    }
    //옵션 선택하기
    public void chooseOpt(){
        do {
            try {
                System.out.print("다시 하시겠습니까?(1:예, 2:아니오)=");
                opt = scan.nextInt();
                if (opt != 1 && opt != 2) throw new LottoExceptionOpt();
                else break;
            }catch (LottoExceptionOpt leo){
                System.out.println(leo.getMessage());
            }catch (InputMismatchException ime){
                scan = new Scanner(System.in);
                System.out.println("1과 2 중에 입력되어야 합니다.");
            }
        }while(true);
    }
    public static void main(String[] args){
        new 김기솔LottoException();
    }
}
class LottoException extends Exception{
    public LottoException(){
        super("양의 정수 값이 입력되어야 합니다.");
    }
}
class LottoExceptionOpt extends Exception{
    public LottoExceptionOpt(){
        super("1과 2 중에 입력되어야 합니다.");
    }
}