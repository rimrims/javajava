package com.yedam.java.ch1101_02;

import com.yedam.java.ch1101_01.Key;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if (this.studentNum == stu.studentNum)
				return true;
		}
		return false;
	}
	
	
}
