package Test221111;

public class EmpDept extends Employee{

	public String team;

	public String getTeamName() {
		return team;
		
		
	}

	@Override
	public void getInformation() {
		System.out.print("이름:" + name);
		System.out.print(" 연봉:" + salary);
		System.out.println(" 부서:" + team);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
}
