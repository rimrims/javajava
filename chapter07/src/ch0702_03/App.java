package ch0702_03;

public class App {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("----------------");
		
		Animal animal = null;
		
		animal = new Dog(); //몸통은 부모, 오버라이딩된 것 들어감
		animal.sound();
		
		animal.breath();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("--------");
		
		animalSound(new Dog()); // 본인 메소드 호출
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) { // 매개변수 자동타입변환
		animal.sound();
	}
	
}
