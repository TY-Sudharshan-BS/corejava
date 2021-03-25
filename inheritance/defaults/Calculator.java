package com.tyss.inheritance.defaults;

public class Calculator {
	
int x;
int y;
int res;

void sum(int x, int y) {
	res = x + y;
	System.out.println(res);
}
void difference(int x, int y) {
	 res = x - y;
		System.out.println(res);
}
void product(int x, int y) {
	res = x * y;
	System.out.println(res);
}
void quotient(int x, int y) {
	res = x / y;
	System.out.println(res);
}

}
