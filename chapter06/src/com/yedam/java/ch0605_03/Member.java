package com.yedam.java.ch0605_03;

public class Member {
	
	//필드
	private String id;
	private String tel;
	private int age;
	
	//생성자
	
	//메소드
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	//private String id;
	public String getId() { // Getter
		// 원본 데이터(yedam) <- 매개변수
		// yedam님 입니다. 로 출력하고 싶다면?
		id += "님 입니다.";
		return id;
	}
	public void setId(String id) { // Setter
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("0보다 작은 나이가 저장되었습니다. 다시 확인하세요.");
			return; // 리턴으로 저장 시키지 않음.
		}else {
		this.age = age;
		}
	}
}
