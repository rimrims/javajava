package Test221111;

public class StandardWeightInfo extends Human{

//	2) StandardWeightInfo 클래스를 정의한다.
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
//	
	public double standardWeight;

	@Override
	public void getInformation() {
		getStandardWeight();
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + " 표준체중 " + standardWeight + "입니다.");
	}

	public double getStandardWeight() {
		standardWeight = (height - 100) * 0.9;
		return standardWeight;
	}

}
