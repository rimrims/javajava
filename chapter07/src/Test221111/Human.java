package Test221111;

public class Human {
//		1) Human 클래스를 정의한다.
//	- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
//	
	
	public String name;
	public int height;
	public int weight;
	
	public void getInformation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "입니다.");
	}
}