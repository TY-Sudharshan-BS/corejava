package com.tyss.methodoverloading.sample;

public class Demo {
	int sum(int x, int y) { //double possible and byte not possible
		int res = x + y;
		return res;
//		System.out.println(res);
	}

	void sum(byte x, byte y) {
		int res = x + y;
		System.out.println(res);
	}

	/* int */ double sum(double x, double y) {
		double z = x + y;
		return z;
	}
}
