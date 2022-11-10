package com.yedam.java.ch0601;

public class Student {

	//필드
	//학생이름
	String name;
	//학교이름
	String school;
	//학번
	int number;
	//학년
	int grade;
	//국어,영어,수학성적
	double korScore;
	double engScore;
	double mathScore;
	
	
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
