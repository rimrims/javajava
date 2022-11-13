package Test221111;

public class EmpApp {
	public static void main(String[] args) {
//		3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//		- 출력결과
//			이름:이지나  연봉:3000  부서:교육부
//			수퍼클래스
//			서브클래스
		EmpDept empDept = new EmpDept();
		
		empDept.team = "교육부";
		
		Employee employee = empDept;
		
		employee.name = "이지나";
		employee.salary = 3000;
		
		employee.getInformation();
		employee.print();
	}
}
