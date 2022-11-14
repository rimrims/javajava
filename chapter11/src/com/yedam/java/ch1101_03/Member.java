package com.yedam.java.ch1101_03;

public class Member {
	
	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;
	
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	}
	
	
}
