package ch0702_01;

public class App {
	public static void method1(Parent parent) {
		if (parent instanceof Child) { // 만약 parent 매개변수가 참조하는 객체가 Child라면,
			Child child = (Child) parent; // 강제타입변환
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method - child 변환 성공");
	}

	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB);
		
		
		// TODO Auto-generated method stub
		Parent parent = new Child();

		parent.field = "parent";

		parent.method1();
		parent.method2();

//		parent.field2 = "child";
//		parent.method3(); // 자식 꺼는 사용 안됨.

		// Casting(자동타입변환)
		Child child = (Child) parent;

		child.field2 = "parent";
		child.method3(); // 사용가능
	}

}
