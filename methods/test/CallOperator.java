package com.tyss.basic.test;

public class CallOperator {
public static void main(String[] args) {
	System.out.println('a'+1); //result is integer
	System.out.println('a'+'a'); //result is integer
	
	byte a = 10;
	byte b = 20;
	System.out.println(a+b); //result is integer
	
	int m = 200;
    long n = 300000000;
    float o = 10.5f;
    double p = 2000000.1;
	System.out.println(m+n); //int+long
	System.out.println(n+o); //long+float
	System.out.println('a'+0.5); //char+float
	System.out.println('a'+1);//char +int
	System.out.println(n+p); //long + double
	
	//increment operators
	System.out.println("post-increment operators");
	int x=5;
	int y=x++;
	int d = 10;
	int e = ++d;
	System.out.println(x);
	System.out.println(y);
	
	System.out.println("pre-increment operators");
	System.out.println(d);
	System.out.println(e);
	
	//decrement operators
	System.out.println("post decrement and increment operators");
	int f = 5;
	int g = f++;
	int h = ++f;
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
	//cannot use 2decrement or 2increment operators 
//	int i = ++h++g;
//	System.out.println(i);
	
	//use + operator to use multiple increment operators
	int i = f++ + g++;
	System.out.println(i);
	
	
	
}
}
