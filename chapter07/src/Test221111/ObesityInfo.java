package Test221111;

public class ObesityInfo extends StandardWeightInfo{

//	3) ObesityInfo 클래스를 정의한다.
//	- StandardWeightInfo 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
//	
	
	public double obesity;
	public String obestr;
	
	@Override
	public void getInformation() {
		getObesity();
		if(obesity <= 18.5) {
			obestr = "저체중";
		}else if(obesity <= 22.9) {
			obestr = "정상";
		}else if(obesity <= 24.9) {
			obestr = "과체중";
		}else {
			obestr = "비만";
		}
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", " + obestr + "입니다.");
	}
	
	public double getObesity() {
		obesity = (weight - standardWeight)/standardWeight * 100;
		return obesity;
//		BMI가 18.5 이하면 저체중 ／ 
//		18.5 ~ 22.9 사이면 정상 ／ 
//		23.0 ~ 24.9 사이면 과체중 ／ 
//		25.0 이상부터는 비만으로 판정.
	}
	

}
