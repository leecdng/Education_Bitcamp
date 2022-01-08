import java.util.Scanner;
public class StandardWeightOOP1 {
	Scanner scan = new Scanner(System.in);
	
	// 데이터 입력값 저장
	int age, gender; // 0
	double height, weight; // 0.0
	double sWeight; // 표준체중
	double sWeightIndex; // 표준체중지수
	String sWeightMsg = "";
	
	StandardWeightOOP1(){}	// 생성자메서드
	
	// 데이터입력 메서드
	double getConData(String msg) {
		System.out.print(msg+"= ");
		return scan.nextDouble();
	}
	
	void setData() {
		age = (int)getConData("나이");
		gender = (int)getConData("성별 (1.남자, 2.여자)");
		height = getConData("키");
		weight = getConData("몸무게");
	}
	
	// 표준체중 index 구하기 / 표준체중 구하기
	void setStandardWeight() {
		double index = 0.90;
		if (age<=35 && gender==2) {
			index = 0.85;
		} else if(age>=36 && gender==1) {
			index = 0.95;
		}
		sWeight = (height-100) * index;
	}
	
	// 표준체중지수 평가기준
	void setStandardWeightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		if(sWeightIndex<=85){
			sWeightMsg = "마른형";	
		} else if(sWeightIndex<=95){
			sWeightMsg = "조금마른형";	
		} else if(sWeightIndex<=115){
			sWeightMsg = "표준형";	
		} else if(sWeightIndex<=125){
			sWeightMsg = "조금비만형";	
		} else{
			sWeightMsg = "비만형";
		}
	}
	
	// 출력
	void standardWeightOutput() {
		System.out.println("표준체중="+sWeight);
		System.out.println("당신의 표준체중지수는"+sWeightIndex+"으로 "+sWeightMsg+"입니다.");
	}
	
	void startStandard() {
		setData();
		setStandardWeight();
		setStandardWeightMsg();
		standardWeightOutput();
	}
	
	
	public static void main(String a[]) {
		StandardWeightOOP1 oop = new StandardWeightOOP1();
		oop.startStandard();
	}
}	

