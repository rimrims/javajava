package ch0703;

public class App {
	public static void main(String[] args) {
		
		//추상 클래스는 자신을 객체화(인스턴스화)할 수 없음
//		Phone phone = new Phone("iphone");
		
		Smartphone smartphone = new Smartphone("고길동");
		
		smartphone.turnOn();
		
		smartphone.internetSearch();
		
		smartphone.turnOff();
	}
}
