package com.tyss.basic.test;

public class AssignmentOperstors {
public static void main(String[] args) {
	int a = 10;
	int b,c;
	
	
	System.out.println(a=b=c=a);
//	int x=20;
//	int x=y=z;
	
	int p,q,r,s;
	p=q=r=s=50;
	System.out.println(s);
	
	int d = 5;
	d=d+5;
	System.out.println("d value is "+d);
	
	//compound assignment operators 
	int e = 10;
	e+=10;
	System.out.println("e value is "+e);
	
	//compound assignment operators 
	int f = 20;
	f-=10;
	System.out.println("f value is "+f);
}
}
