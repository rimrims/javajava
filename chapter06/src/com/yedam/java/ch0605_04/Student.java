package com.yedam.java.ch0605_04;

public class Student {
	//필드
	//학생이름
	private String name;
	//학교이름
	private String school;
	//학번
	private int number;
	//학년
	private int grade;
	//국어,영어,수학성적
	private double korScore;
	private double engScore;
	private double mathScore;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getKorScore() {
		return korScore;
	}

	public void setKorScore(double korScore) {
		this.korScore = korScore;
	}

	public double getEngScore() {
		return engScore;
	}

	public void setEngScore(double engScore) {
		this.engScore = engScore;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	//생성자
	//생성자를 통해서 모든 데이터를 입력
	public Student(String name, String school, int number, int grade,
					double korScore, double engScore, double mathScore) {
		this.name = name;
		this.school = school;
		this.number = number;
		this.grade = grade;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
//		getInfo(); //생성자 안에 메소드 넣는 것도 가능
	}
	
	//메소드
	//getInfo() 학생의 내용을 출력할 수 있는 기능
	void getInfo() {
		System.out.println(name+school+number+grade+korScore+engScore+mathScore);
	}
}
