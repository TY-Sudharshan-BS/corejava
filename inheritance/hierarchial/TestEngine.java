package com.tyss.inheritance.hierarchial;

public class TestEngine {
public static void main(String[] args) {
	Yamaha ym = new Yamaha();
	ym.chise_num = 1000;
	ym.color = "black";
	ym.cc = "1000cc";
	ym.name();
	
	System.out.println("**********************");
	
	Honda h = new Honda();
	h.chise_num = 102;
	h.color = "silver";
	h.name();
}
}
