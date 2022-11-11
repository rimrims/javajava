package ch0702;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = null; // 객체 만들어지지 않음.
		
		animal = new Cat(); 
		animal.speak(); 
		
		animal = new Dog();
		animal.speak();
	}

}
