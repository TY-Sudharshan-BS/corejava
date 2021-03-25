package com.tyss.constructor.thisst;

public class RecursiveConst {
	public RecursiveConst() {
		this();
		System.out.println("default const");
	}

	public RecursiveConst(int a) {
		this();
		System.out.println("paramet const");
	}

}
