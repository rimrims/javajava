package com.yedam.java.ch1101오브젝트;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//Object obj = new Member("blue");
		
		Member member = (Member) obj;
		//Member member = new Member("blue");
		
		if(id.equals(member.id)) {
			return true;
		}
		return false;
	}
}
