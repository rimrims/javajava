package com.yedam.java.ch1101_03;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number)
				return true;
		}
		return false;
	}													

	@Override
	public String toString() {
		return "Key값은 : " + number;
	}
	
}
