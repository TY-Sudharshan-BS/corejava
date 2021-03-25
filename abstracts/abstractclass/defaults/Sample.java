package com.tyss.abstractclass.defaults;

public abstract class Sample extends Demo {

	@Override
	public void doStuff() {
		System.out.println("do stuff method implemented in abstract");
	}

	@Override
	public abstract void doWork();

}
