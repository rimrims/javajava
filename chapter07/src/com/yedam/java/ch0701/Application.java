package com.yedam.java.ch0701;

public class Application {
	public static void main(String[] args) {

		Child child = new Child(); // 자식 클래스 객체화
		
		//자식 클래스 고유 필드 사용
		child.lastName = "paul";
		child.age = 20;
		
		//부모 클래스 필드 사용
		System.out.println(child.firstName + child.lastName); // 부모 클래스의 필드를 자식 클래스가 물려받아서 사용가능.
							//위에 부모 클래스 필드임.
		
//		System.out.println(child.job); // 부모 필드 private이라 접근 불가.

		//부모 -> 여러 명의 자식 o
		//자식 -> 여러 명의 부모 x
		
		System.out.println("==============================================");
		
		Child cd = new Child(); // 자식 클래스 인스턴스화
		
		cd.method1(); // 자식클래스에서 오버라이딩
		cd.method2(); // 부모클래스 메소드
		cd.method3(); // 자식 클래스 메소드
		
		System.out.println("===============================================");
		
		//자동타입변환: 
		//부모 클래스에 있는 필드, 메소드 사용함.
		//단, 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재한다면
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용
		Child chd = new Child();
		Parent parent = chd; // Parent Parent = new Child(); // 자식이 부모 타입으로 바뀜. -> 부모타입 클래스만 사용가능.
							// like 상속과 반대의 개념 (부모가 자식 것 들고와서 씀)
		
		parent.method1(); // 오버라이딩. 그래서 자식 메소드 들고옴. 출처는 부모클래스니까 사용가능
		parent.method2(); // 부모 메소드
//		parent.method3(); // 자식 메소드라서 x
		
		
	}
}
