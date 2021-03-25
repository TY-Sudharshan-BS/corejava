package com.tyss.mockpractice.arraylists;

import java.util.Arrays;

public class MyArrayList {
	private Object eleData[];
	private final int DEF_SIZE = 5;
	private int size = 0;

	public MyArrayList() {
		this.eleData = new Object[DEF_SIZE];
	}

	public void increaseSize(Object el) {
		if (size == DEF_SIZE) {
			System.out.println("method called");
			int prevSize = eleData.length;
			int nextSize = prevSize + prevSize >> 1;
			eleData = Arrays.copyOf(eleData, nextSize);
		}
		this.eleData[size] = el;
		size++;
	}
	

}
