package com.tyss.interfaces.view;

public class Sports implements Cricket {

	@Override
	public void play() {
		System.out.println("playing method");
	}

	@Override
	public void bowled() {
		System.out.println("bowled method");
	}

}
