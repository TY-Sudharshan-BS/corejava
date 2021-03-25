package com.tyss.exceptions.trycatch;

public class Marriage extends RuntimeException {
	String s;

	public Marriage(String s) {
		this.s = s;
	}
}
