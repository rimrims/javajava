package Test221111;

public class ObesityApp {
	public static void main(String[] args) {
//		4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//		- 출력결과
//		홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//		박둘이님의 신장 168, 몸무게 90, 비만입니다.
//		- 조건
//		변수는 Human 클래스 타입으로 선언하여 하나만 사용한다. // 자동타입변환
		
		Human std = new StandardWeightInfo();
		Human obes = new ObesityInfo();
		
		std.name = "홍길동";
		std.height = 168;
		std.weight = 45;
		
		std.getInformation();
		
		obes.name = "박둘이";
		obes.height = 168;
		obes.weight = 90;
		
		obes.getInformation();
		
	
	}
}
