package com.tyss.singleton.single;


public class SingleTon {
	private static SingleTon singleton = null;

	// private constructor
	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (singleton == null) {
			singleton = new SingleTon();
			System.out.println("single ton");
			return singleton;
		} else {
			System.out.println("sorry another instance cannot be created");
			return singleton;

		}
	}

	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
//		SingleTon.getInstance();
//		SingleTon.getInstance();
//		SingleTon.getInstance();
		System.out.println(s1 == s2);

	}

}
