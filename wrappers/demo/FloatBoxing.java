package com.tyss.wrappers.demo;

public class FloatBoxing {
	public static void main(String[] args) {
		float f = 10.5f;
		Float fl = new Float(f);
		System.out.println(fl);

		float t = fl;
		System.out.println(t);
		
		
	}
}
