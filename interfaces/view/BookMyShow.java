package com.tyss.interfaces.view;

public class BookMyShow implements Movie, HorrorMovie {

	@Override
	public void director() {
		System.out.println("action cut");
	}

	@Override
	public void actor() {
		System.out.println("deepika padukone");
	}

}
